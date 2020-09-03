package org.codigorupestre.datasource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DataSourceMariaDB {

	//@Value("${database.mariadb.driver.classname}")
	@Value("org.mariadb.jdbc.Driver")
	private String driverClassName;
	@Value("{database.mariadb.url}")
	private String url;
	@Value("{database.mariadb.username}")
	private String userName;
	@Value("{database.mariadb.password}")
	private String password;

	@Value("{database.mariadb.db.votodigital}")
	private String dbVotoDigital;
	@Value("{database.mariadb.db.bitacora}")
	private String dbBitacora;
	@Value("{database.mariadb.db.boletos}")
	private String dbBoletos;


	

	@Bean
	@Primary
	public BasicDataSource dataSourceVotoDigital() {
		return getConnection(dbVotoDigital);
	}

	@Bean
	public BasicDataSource dataSourceBoletosSpaceNative() {
		return getConnection(dbBoletos);
	}

	@Bean("bitacora")
	public BasicDataSource dataSourceBitacora() {
		return getConnection(dbBitacora);
	}
	
	
	private BasicDataSource getConnection(String dataBase) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url + dataBase);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		
		return dataSource;
	}
	
	
}
