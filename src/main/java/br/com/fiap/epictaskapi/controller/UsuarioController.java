package br.com.fiap.epictaskapi.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public Page<User> index(Pageable pageable){
		return service.listAll(pageable);
		
	}

  @PostMapping
  public ResponseEntity<User> create(@RequestBody @Valid User user){
      service.save(user);
      return ResponseEntity.status(HttpStatus.CREATED).body(user);
  }


}
