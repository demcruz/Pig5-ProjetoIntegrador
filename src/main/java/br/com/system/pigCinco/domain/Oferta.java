
package br.com.system.pigCinco.domain;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Oferta implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -2963807307071321842L;

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oferta_id;

	private String oferta_descricao;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate oferta_data_inicio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate oferta_data_final;

	private Double oferta_preco;

	private String oferta_status;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	public Integer getOferta_id() {
		return oferta_id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setOferta_id(Integer oferta_id) {
		this.oferta_id = oferta_id;
	}

	public String getOferta_descricao() {
		return oferta_descricao;
	}

	public void setOferta_descricao(String oferta_descricao) {
		this.oferta_descricao = oferta_descricao;
	}

	public LocalDate getOferta_data_inicio() {
		return oferta_data_inicio;
	}

	public void setOferta_data_inicio(LocalDate oferta_data_inicio) {
		this.oferta_data_inicio = oferta_data_inicio;
	}

	public LocalDate getOferta_data_final() {
		return oferta_data_final;
	}

	public void setOferta_data_final(LocalDate oferta_data_final) {
		this.oferta_data_final = oferta_data_final;
	}

	public Double getOferta_preco() {
		return oferta_preco;
	}

	public void setOferta_preco(Double oferta_preco) {
		this.oferta_preco = oferta_preco;
	}

	public String getOferta_status() {
		return oferta_status;
	}

	public void setOferta_status(String oferta_status) {
		this.oferta_status = oferta_status;
	}

}
