package org.codigorupestre.service;

import java.util.List;

import org.codigorupestre.dao.CiudadanoDAO;
import org.codigorupestre.model.Ciudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CiudadanoServiceImpl implements CiudadanoService {
	
	@Autowired
	private CiudadanoDAO dao;

	public void registrarCiudadano(Ciudadano ciudadano) {
		dao.registrarCiudadano(ciudadano);
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
