package com.car.center.response;

import com.car.center.dto.TipoDocumento;

import lombok.Data;

@Data
public class MecanicosResponse {

	private Long id;

	private TipoDocumento tipoIdentificacion;

	private String nombre;

	private String apellidos;

	private Integer edad;

	private Integer telefono;

	private String direccion;
}
