package br.com.system.pigCinco.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2253480793140665414L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cliente_id;
	
	private String cliente_cpf;
	
	private String cliente_nome;
	
	private String cliente_sobrenome;
	
	private String cliente_email;
	
	private String cliente_status;

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getCliente_status() {
		return cliente_status;
	}

	public void setCliente_status(String cliente_status) {
		this.cliente_status = cliente_status;
	}

	public String getCliente_cpf() {
		return cliente_cpf;
	}

	public void setCliente_cpf(String cliente_cpf) {
		this.cliente_cpf = cliente_cpf;
	}

	public String getCliente_nome() {
		return cliente_nome;
	}

	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}

	public String getCliente_sobrenome() {
		return cliente_sobrenome;
	}

	public void setCliente_sobrenome(String cliente_sobrenome) {
		this.cliente_sobrenome = cliente_sobrenome;
	}

	public String getCliente_email() {
		return cliente_email;
	}

	public void setCliente_email(String cliente_email) {
		this.cliente_email = cliente_email;
	}


	
	
	
	
	
}
