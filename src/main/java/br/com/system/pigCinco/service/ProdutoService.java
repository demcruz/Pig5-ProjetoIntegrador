package br.com.system.pigCinco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.pigCinco.domain.Produto;
import br.com.system.pigCinco.repository.ProdutoRepository;
import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public Produto search(Integer produto_id) throws ObjectNotFoundException{
		Optional<Produto> chave = produtoRepository	.findById(produto_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + produto_id + ", Tipo!" + Produto.class.getName()));
	}
	
	public List <Produto> searchAll(){
		return produtoRepository.findAll();
	}
	
	public Produto save (Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public List <Produto> saveAll(List<Produto> produto){
		return produtoRepository.saveAll(produto);
	}
	
	public void delete(Integer produto_id) {
		produtoRepository.deleteById(produto_id);
	}
	
}
