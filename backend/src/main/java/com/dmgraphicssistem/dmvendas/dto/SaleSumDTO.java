package com.dmgraphicssistem.dmvendas.dto;

import java.io.Serializable;

import com.dmgraphicssistem.dmvendas.entites.Seller;

/*
 * Classe que tras o total de vendas de cada vendedor.
 */
public class SaleSumDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;

	public SaleSumDTO() {
		
	}

	/*
	 * Chamado o Seller.getName para agrupar as consultas não só por nome.
	 */
	public SaleSumDTO(Seller seller, Double sum) {
		
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
