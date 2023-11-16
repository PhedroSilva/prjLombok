package com.pedrao.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrao.lombok.projetoLombok.entities.Usuario;
	

	public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	}
