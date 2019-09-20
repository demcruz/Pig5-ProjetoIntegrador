package br.com.system.pigCinco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.system.pigCinco.domain.Cliente;
import br.com.system.pigCinco.service.ClienteService;





@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("/cliente/cadastro");
		mv.addObject("cliente", new Cliente());
		return mv;
	}

	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("cliente/lista");
		mv.addObject("clientes", clienteService.searchAll());
		return mv;
	}

	/*
	 * @PostMapping("/salvar") public String salvarCliente(Cliente cliente) {
	 * clienteService.save(cliente); return "redirect:/cliente/cadastrar"; }
	 */

	/*
	 * @GetMapping("/deletar/{cliente_id}") public ModelAndView
	 * deletar(@PathVariable("cliente_id") Integer cliente_id) {
	 * clienteService.delete(cliente_id); return listar(); }
	 */

	@PostMapping("/salvar")
	public String salvar(Cliente cliente, RedirectAttributes attr) {
		clienteService.save(cliente);
		attr.addFlashAttribute("sucess", "Cliente Inserido com sucesso.");
		return "redirect:/cliente/cadastrar";
	}

	@GetMapping("/deletar/{cliente_id}")
	public String deletar(@PathVariable("cliente_id") Integer cliente_id, RedirectAttributes attr) {
		clienteService.delete(cliente_id);
		attr.addFlashAttribute("Sucess", "Cliente Excluido da base.");
		return "redirect:/cliente/listar";
	}

}
