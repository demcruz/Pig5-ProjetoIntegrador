package br.com.system.pigCinco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.pigCinco.repository.UsuarioRepository;



@Service
public class UsuarioService  {

	@Autowired
	UsuarioRepository usuarioRepository;
	
}
