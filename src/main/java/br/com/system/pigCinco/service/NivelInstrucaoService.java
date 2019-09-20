package br.com.system.pigCinco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.pigCinco.domain.NivelInstrucao;
import br.com.system.pigCinco.repository.NivelInstrucaoRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class NivelInstrucaoService {
	
	@Autowired
	NivelInstrucaoRepository repoNivelInstrucao;
	
	/*
	 * public List<NivelInstrucao>buscarTodosNiveis(){
	 * 
	 * return repoNivelInstrucao.findAll(); }
	 * 
	 * 
	 * public NivelInstrucao salvar(NivelInstrucao nivelInstrucao) { return
	 * repoNivelInstrucao.save(nivelInstrucao); }
	 * 
	 * public NivelInstrucao buscarPorID(Integer id) throws ObjectNotFoundException{
	 * Optional<NivelInstrucao> nivelInstrucao = repoNivelInstrucao.findById(id);
	 * return nivelInstrucao.orElseThrow(() -> new
	 * ObjectNotFoundException("Nível de Instrução não encontrado. id: " +id)); }
	 * 
	 * public NivelInstrucao salvarAlteracao(NivelInstrucao nivelAlterado) throws
	 * ObjectNotFoundException{ NivelInstrucao nivelInstrucao =
	 * buscarPorID(nivelAlterado.getNivel_instrucao_id());
	 * nivelInstrucao.setNivel_instrucao_descricao(nivelAlterado.
	 * getNivel_instrucao_descricao());
	 * nivelInstrucao.setNivel_instrucao_status(nivelAlterado.
	 * getNivel_instrucao_status()); return salvar(nivelInstrucao); }
	 * 
	 * public void excluir (Integer id) { repoNivelInstrucao.deleteById(id); }
	 */
	
	
	
	
	public NivelInstrucao search(Integer nivel_instrucao_id) throws ObjectNotFoundException{
		Optional<NivelInstrucao> chave = repoNivelInstrucao.findById(nivel_instrucao_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + nivel_instrucao_id + ", Tipo!" + NivelInstrucao.class.getName()));
	}
	
	
	public List<NivelInstrucao> searchAll(){
		return repoNivelInstrucao.findAll();
	}
	
	
	public NivelInstrucao save (NivelInstrucao NivelInstrucao) {
		return repoNivelInstrucao.save(NivelInstrucao);
	}
		
	public List<NivelInstrucao> saveAll(List<NivelInstrucao> NivelInstrucao){
		return repoNivelInstrucao.saveAll(NivelInstrucao);
	}
	
	
	public void delete(Integer NivelInstrucao) {
		repoNivelInstrucao.deleteById(NivelInstrucao);
	}

}
