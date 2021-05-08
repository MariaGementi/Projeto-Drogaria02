package br.pro.drogaria.domain;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial") 
@MappedSuperclass //classe não corresponde a uma tabela
public class GenericDomain implements Serializable {
	
	@Id //chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
}
