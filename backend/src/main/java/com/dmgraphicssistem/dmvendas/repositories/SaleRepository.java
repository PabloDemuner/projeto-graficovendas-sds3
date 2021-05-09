package com.dmgraphicssistem.dmvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dmgraphicssistem.dmvendas.dto.SaleSuccesDTO;
import com.dmgraphicssistem.dmvendas.dto.SaleSumDTO;
import com.dmgraphicssistem.dmvendas.entites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	/*
	 * Consulta JPQL
	 */
	@Query("SELECT new com.dmgraphicssistem.dmvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupBySeller();
	
	/*
	 * Consulta JPQL
	 */
	@Query("SELECT new com.dmgraphicssistem.dmvendas.dto.SaleSuccesDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccesDTO> succesGroupBySeller();
}
