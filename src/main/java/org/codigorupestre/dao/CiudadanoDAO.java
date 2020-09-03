package org.codigorupestre.dao;

import java.util.List;

import org.codigorupestre.model.Ciudadano;

public interface CiudadanoDAO {
	
	public void registrarCiudadano(Ciudadano ciudadano);

	public void eliminarCiudadano(String curp);

	public Ciudadano buscarCiudadanoPorCurp(String curp);

	public List<Ciudadano> buscarCiudadanosPorMunicipio(String municipio);


}
