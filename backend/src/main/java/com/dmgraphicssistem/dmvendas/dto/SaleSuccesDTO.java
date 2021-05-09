package com.dmgraphicssistem.dmvendas.dto;

import java.io.Serializable;

import com.dmgraphicssistem.dmvendas.entites.Seller;

/*
 * Classe que tras o total de vendas de cada vendedor.
 */
public class SaleSuccesDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccesDTO() {
		
	}

	/*
	 * Chamado o Seller.getName para agrupar as consultas não só por nome.
	 */
	public SaleSuccesDTO(Seller seller, Long visited, Long deals) {
		
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
}
