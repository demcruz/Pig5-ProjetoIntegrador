package br.com.system.pigCinco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.system.pigCinco.domain.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {

}
