package br.com.system.pigCinco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.pigCinco.domain.Cliente;
import br.com.system.pigCinco.repository.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente search(Integer cliente_id) throws ObjectNotFoundException{
		Optional<Cliente> chave = clienteRepository.findById(cliente_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + cliente_id + ", Tipo!" + Cliente.class.getName()));
	}
	
	
	public List<Cliente> searchAll(){
		return clienteRepository.findAll();
	}
	
	
	public Cliente save (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
		
	public List<Cliente> saveAll(List<Cliente> cliente){
		return clienteRepository.saveAll(cliente);
	}
	
	
	public void delete(Integer cliente_id) {
		clienteRepository.deleteById(cliente_id);
	}
}
