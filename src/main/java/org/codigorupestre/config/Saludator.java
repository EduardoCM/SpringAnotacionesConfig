package org.codigorupestre.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saludator {
	
	@Value("Hola Mundo")
	private String mensaje;
	
	
	public String saludo() {
		return mensaje;
	}

}
