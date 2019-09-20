package br.com.system.pigCinco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.pigCinco.domain.Oferta;
import br.com.system.pigCinco.repository.OfertaRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service 
public class OfertaService {

	@Autowired
	OfertaRepository ofertaRepository;
	
	public Oferta search(Integer oferta_id) throws ObjectNotFoundException{
		Optional<Oferta> chave = ofertaRepository.findById(oferta_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + oferta_id + ", Tipo!" + Oferta.class.getName()));
	}
	
	public List <Oferta> searchAll(){
		return ofertaRepository.findAll();
	}
	
	public Oferta save (Oferta oferta) {
		return ofertaRepository.save(oferta);
	}
	
	public List <Oferta> saveAll(List<Oferta> produto){
		return ofertaRepository.saveAll(produto);
	}
	
	public void delete(Integer oferta_id) {
		ofertaRepository.deleteById(oferta_id);
	}
	
	
}
