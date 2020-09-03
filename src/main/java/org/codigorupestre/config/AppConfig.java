package org.codigorupestre.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"org.codigorupestre", "org.codigorupestre.datasource"})
@PropertySource("classpath:/basedatos.properties")
public class AppConfig {
	
	
	
	


}
