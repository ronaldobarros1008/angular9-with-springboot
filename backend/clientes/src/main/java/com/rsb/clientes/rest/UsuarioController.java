package com.rsb.clientes.rest;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rsb.clientes.model.repository.UsuarioRepository;
import com.rsb.model.entity.Usuario;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioRepository repository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar( @RequestBody @Valid Usuario usuario) {
		repository.save(usuario);
	}
	
}
