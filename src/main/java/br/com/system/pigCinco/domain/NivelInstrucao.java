package br.com.system.pigCinco.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NivelInstrucao implements Serializable{
	
	
	private static final long serialVersionUID = 7577700769805912195L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nivel_instrucao_id;
	
	private String nivel_instrucao_descricao;
	
	private String nivel_instrucao_status;
	

	public int getNivel_instrucao_id() {
		return nivel_instrucao_id;
	}

	public void setNivel_instrucao_id(int nivel_instrucao_id) {
		this.nivel_instrucao_id = nivel_instrucao_id;
	}

	public String getNivel_instrucao_descricao() {
		return nivel_instrucao_descricao;
	}

	public void setNivel_instrucao_descricao(String nivel_instrucao_descricao) {
		this.nivel_instrucao_descricao = nivel_instrucao_descricao;
	}

	public String getNivel_instrucao_status() {
		return nivel_instrucao_status;
	}

	public void setNivel_instrucao_status(String nivel_instrucao_status) {
		this.nivel_instrucao_status = nivel_instrucao_status;
	}
	
	
	
	

}
