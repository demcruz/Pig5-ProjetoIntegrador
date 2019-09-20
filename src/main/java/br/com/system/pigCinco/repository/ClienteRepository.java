package br.com.system.pigCinco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.system.pigCinco.domain.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
