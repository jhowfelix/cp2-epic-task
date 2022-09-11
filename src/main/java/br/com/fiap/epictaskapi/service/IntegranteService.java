package br.com.fiap.epictaskapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.epictaskapi.model.Integrante;
import br.com.fiap.epictaskapi.repository.IntegranteRepository;


@Service
public class IntegranteService {
	
	@Autowired
	private IntegranteRepository integranteRepository;
	
	
	public List<Integrante> findAll(){
		return integranteRepository.findAll();
	}

}
