package br.com.system.pigCinco.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = -8868607571027162750L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int produto_id;
	
	private String produto_nome;

	public String getProduto_nome() {
		return produto_nome;
	}

	public void setProduto_nome(String produto_nome) {
		this.produto_nome = produto_nome;
	}

	private String produto_descricao;
	private String produto_status;

	@ManyToOne
	@JoinColumn(name = "nivel_instrucao_id")
	private NivelInstrucao nivelInstrucao;

	public int getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(int produto_id) {
		this.produto_id = produto_id;
	}

	public String getProduto_descricao() {
		return produto_descricao;
	}

	public void setProduto_descricao(String produto_descricao) {
		this.produto_descricao = produto_descricao;
	}

	public String getProduto_status() {
		return produto_status;
	}

	public void setProduto_status(String produto_status) {
		this.produto_status = produto_status;
	}

	public NivelInstrucao getNivelInstrucao() {
		return nivelInstrucao;
	}

	public void setNivelInstrucao(NivelInstrucao nivelInstrucao) {
		this.nivelInstrucao = nivelInstrucao;
	}

}
