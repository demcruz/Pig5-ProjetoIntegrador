package br.com.system.pigCinco.domain;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

public class ClientePossivelProduto {
	
	//chaves compostas
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns(value = {
	    @JoinColumn(name = "idProduto", referencedColumnName = "produto_id"),
	    @JoinColumn(name = "idCliente", referencedColumnName = "cliente_id")
	})
	
	private String cliente_possivel_produto_status;
	private Date cliente_possivel_produto_data;
	
	public String getCliente_possivel_produto_status() {
		return cliente_possivel_produto_status;
	}
	public void setCliente_possivel_produto_status(String cliente_possivel_produto_status) {
		this.cliente_possivel_produto_status = cliente_possivel_produto_status;
	}
	public Date getCliente_possivel_produto_data() {
		return cliente_possivel_produto_data;
	}
	public void setCliente_possivel_produto_data(Date cliente_possivel_produto_data) {
		this.cliente_possivel_produto_data = cliente_possivel_produto_data;
	}
	
	
	
	
	

}
