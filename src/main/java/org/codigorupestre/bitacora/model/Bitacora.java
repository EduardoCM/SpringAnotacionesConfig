package org.codigorupestre.bitacora.model;

import java.time.LocalDateTime;

public class Bitacora {
	
	private int id;
	
	private String usuario;
	
	private String operacion;
	
	private LocalDateTime hora;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	@SuppressWarnings("static-access")
	public  String getHora() {
		return hora.now().toString();
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	
	
	

}
