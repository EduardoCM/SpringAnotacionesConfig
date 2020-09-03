package org.codigorupestre.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.codigorupestre.bitacora.dao.BitacoraDAO;
import org.codigorupestre.bitacora.model.Bitacora;
import org.codigorupestre.model.Ciudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CiudadanoDAOImpl implements CiudadanoDAO {
	
private Logger LOG = Logger.getLogger(CiudadanoDAOImpl.class.getName());
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Autowired
	private BitacoraDAO bitacoraDao;

	public void registrarCiudadano(Ciudadano ciudadano) {
		LOG.info("Usuario a registrar: " + ciudadano);
		String insertCiudadano = "INSERT INTO Ciudadano (nombre, direccion, claveElector, curp, estado, municipio) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(insertCiudadano, new Object[] {ciudadano.getNombre(), ciudadano.getDireccion(), ciudadano.getClaveElector(), ciudadano.getCurp(), ciudadano.getEstado(), ciudadano.getMunicipio()});
		
		Bitacora bitacora = new Bitacora();
		bitacora.setUsuario("UsuarioLogin");
		bitacora.setOperacion(insertCiudadano);
		
		bitacoraDao.guardarBitacora(bitacora);
	}

	public void eliminarCiudadano(String curp) {
		// TODO Auto-generated method stub
		
	}

	public Ciudadano buscarCiudadanoPorCurp(String curp) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ciudadano> buscarCiudadanosPorMunicipio(String municipio) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
