package br.com.fiap.epictaskapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {
	
	@Autowired
	private UserService service;
	
	
	public Page<User> index(Pageable pageable){
		return service.listAll(pageable);
		
	}

}
