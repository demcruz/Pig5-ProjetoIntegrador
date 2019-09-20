package br.com.system.pigCinco.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8004696378948522914L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuario_id;

	private String usuario_nome;

	private String usuario_Login;

	private String usuario_senha;

	private String usuario_Cargo;

	private String usuario_Status;

	public Integer getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUsuario_nome() {
		return usuario_nome;
	}

	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}

	public String getUsuario_Login() {
		return usuario_Login;
	}

	public void setUsuario_Login(String usuario_Login) {
		this.usuario_Login = usuario_Login;
	}

	public String getUsuario_senha() {
		return usuario_senha;
	}

	public void setUsuario_senha(String usuario_senha) {
		this.usuario_senha = usuario_senha;
	}

	public String getUsuario_Cargo() {
		return usuario_Cargo;
	}

	public void setUsuario_Cargo(String usuario_Cargo) {
		this.usuario_Cargo = usuario_Cargo;
	}

	public String getUsuario_Status() {
		return usuario_Status;
	}

	public void setUsuario_Status(String usuario_Status) {
		this.usuario_Status = usuario_Status;
	}

}
