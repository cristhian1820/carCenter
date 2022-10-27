package com.car.center.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcesoResponse {

	private Boolean estado;

	private String msj;

	public ProcesoResponse() {
		super();
	}

	public ProcesoResponse(Boolean estado, String msj) {
		super();
		this.estado = estado;
		this.msj = msj;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}
	
	
}
