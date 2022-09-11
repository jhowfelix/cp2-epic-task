package br.com.fiap.epictaskapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epictaskapi.model.Integrante;
import br.com.fiap.epictaskapi.service.IntegranteService;

@RestController
@RequestMapping("/api/integrantes")
public class IntegrantesController {
	
	
	@Autowired
	private IntegranteService integranteService;
	
	@GetMapping
	public ResponseEntity<List<Integrante>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(integranteService.findAll());
	}

}
