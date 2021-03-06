package com.dmgraphicssistem.dmvendas.dto;

import java.io.Serializable;

import com.dmgraphicssistem.dmvendas.entites.Seller;

/*
 * Serializable converte converte os dados de DTO para bytes para que os objetos possam 
 * ser trafegados em Rede, salvo em arquivos etc...
 */
public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	/*
	 * Construtor que copia os dados da entidade Seller para a entidade SellerDTO 
	 * Fazendo a converção para DTO .
	 */
	public SellerDTO(Seller entity) {
		super();
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
