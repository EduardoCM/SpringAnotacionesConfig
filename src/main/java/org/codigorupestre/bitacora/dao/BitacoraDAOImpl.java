package org.codigorupestre.bitacora.dao;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.codigorupestre.bitacora.model.Bitacora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BitacoraDAOImpl implements BitacoraDAO {
	
	private Logger LOG = Logger.getLogger(BitacoraDAOImpl.class.getName());


	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("bitacora")
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	public void guardarBitacora(Bitacora bitacora) {
		LOG.info("Se guarda bitacora:::" + bitacora);
		String insertBitacora = "INSERT INTO Bitacora (usuario, operacion, hora) value (?, ?, ?)";
		jdbcTemplate.update(insertBitacora, new Object[] {bitacora.getUsuario(), bitacora.getOperacion(), bitacora.getHora()});
	}

}
