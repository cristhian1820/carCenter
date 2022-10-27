package com.car.center.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.center.request.MecanicosRequest;
import com.car.center.response.MecanicosResponse;
import com.car.center.response.ProcesoResponse;
import com.car.center.service.MecanicosService;


@RestController
@RequestMapping("/mecanicos")
public class MecanicosController {
	
	@Autowired
	private MecanicosService mecanicosService;
	
	@PostMapping("/guardar")
	public ResponseEntity<ProcesoResponse> guarar(@RequestBody MecanicosRequest mecanicosRequest) throws Exception {
		return ResponseEntity.ok().body(mecanicosService.guardar(mecanicosRequest));
	}

	@PostMapping("/actualizar")
	public ResponseEntity<ProcesoResponse> actualizar(@RequestBody MecanicosRequest mecanicosRequest) throws Exception {
		return ResponseEntity.ok().body(mecanicosService.actualizar(mecanicosRequest));
	}

	@PostMapping("/eliminar")
	public ResponseEntity<ProcesoResponse> eliminar(@RequestParam Long mecanicosId) throws Exception {
		return ResponseEntity.ok().body(mecanicosService.eliminar(mecanicosId));
	}

	@GetMapping("/consultar")
	public ResponseEntity<List<MecanicosResponse>> consultar() throws Exception {
		return ResponseEntity.ok().body(mecanicosService.consultar());
	}

}
