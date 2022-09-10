package br.com.fiap.epictaskapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public Page<User> listAll(Pageable paginacao) {
		Page<User> findAll = repository.findAll(paginacao);
		findAll.forEach(t -> t.setPassword(null));
		return findAll;
	}

	public User save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repository.save(user);
		user.setPassword(null);
		return user;

	}

	public Optional<User> findById(Long id) {
		Optional<User> findById = repository.findById(id);
		if(findById.isPresent()) {
			findById.get().setPassword(null);
		}
		return findById;
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
