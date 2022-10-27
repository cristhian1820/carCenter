package com.car.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.center.repository.MecanicosRepository;
import com.car.center.request.MecanicosRequest;
import com.car.center.response.MecanicosResponse;
import com.car.center.response.ProcesoResponse;

@Service
public class MecanicosServiceImpl implements MecanicosService {

	@Autowired
	private MecanicosRepository mecanicosRepository;

	@Override
	public ProcesoResponse guardar(MecanicosRequest mecanicosRequest) throws Exception {

		try {

			mecanicosRepository.save(mecanicosRequest);

			return null;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public ProcesoResponse actualizar(MecanicosRequest mecanicosRequest) throws Exception {

		try {
			ProcesoResponse response = new ProcesoResponse();

			mecanicosRepository.save(mecanicosRequest);
			
			return response;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public ProcesoResponse eliminar(Long mecanicosId) throws Exception {
		try {
			mecanicosRepository.deleteById(mecanicosId);
			return null;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<MecanicosResponse> consultar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
