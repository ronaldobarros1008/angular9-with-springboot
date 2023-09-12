package com.rsb.clientes.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsb.model.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario> findByUsername(String username);

}
