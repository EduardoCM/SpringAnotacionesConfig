package org.codigorupestre.service;

import java.util.List;

import org.codigorupestre.model.Ciudadano;

public interface CiudadanoService {
	
	public void registrarCiudadano(Ciudadano ciudadano);

	public void eliminarCiudadano(String curp);

	public Ciudadano buscarCiudadanoPorCurp(String curp);

	public List<Ciudadano> buscarCiudadanosPorMunicipio(String municipio);


}
