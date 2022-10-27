package com.car.center.request;

import com.car.center.dto.TipoDocumento;

import lombok.Data;

@Data
public class MecanicosRequest {

	private Long id;

	private TipoDocumento tipoIdentificacion;

	private String nombre;

	private String apellidos;

	private Integer edad;

	private Integer telefono;

	private String direccion;
}
