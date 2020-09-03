package org.codigorupestre.config;

import org.codigorupestre.model.Ciudadano;
import org.codigorupestre.service.CiudadanoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Saludator saludator = appContext.getBean(Saludator.class);
		
		System.out.println(saludator.saludo());
		
		CiudadanoService ciudadanoSerive = appContext.getBean(CiudadanoService.class);
		
	    Ciudadano ciudadano = new Ciudadano();
	    ciudadano.setNombre("Eduardo Castillo Mendoza");
	    ciudadano.setDireccion("Java Config Config");
	    ciudadano.setCurp("CAME234");
	    ciudadano.setEstado("1010");
	    ciudadano.setMunicipio("0101");
	    ciudadano.setClaveElector("ASFG12345");
	    ciudadanoSerive.registrarCiudadano(ciudadano);
		
		((AnnotationConfigApplicationContext)appContext).close();
		
	}

}
