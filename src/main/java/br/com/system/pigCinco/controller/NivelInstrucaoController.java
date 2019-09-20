package br.com.system.pigCinco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.system.pigCinco.domain.NivelInstrucao;
import br.com.system.pigCinco.service.NivelInstrucaoService;






@Controller
@RequestMapping("/nivelInstrucao")
public class NivelInstrucaoController {
	
	@Autowired
	private NivelInstrucaoService nivelInstrucaoService;
	
    @GetMapping("/listarNiveis")
	public ModelAndView listaTodosNiveis() {
		ModelAndView mv = new ModelAndView("nivelInstrucao/paginaListaNiveis");
		mv.addObject("niveis", nivelInstrucaoService.searchAll());
		return mv;
	}
    
    @GetMapping("/cadastrar")
    public ModelAndView cadastrarNiveis() {
    	ModelAndView mv = new ModelAndView("nivelInstrucao/cadastraNiveis");
    	mv.addObject("nivelInstrucao", new NivelInstrucao());
    	return mv;
    }
    
    
}
