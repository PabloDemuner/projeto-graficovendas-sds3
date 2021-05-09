package com.dmgraphicssistem.dmvendas.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmgraphicssistem.dmvendas.dto.SaleDTO;
import com.dmgraphicssistem.dmvendas.dto.SaleSuccesDTO;
import com.dmgraphicssistem.dmvendas.dto.SaleSumDTO;
import com.dmgraphicssistem.dmvendas.entites.Sale;
import com.dmgraphicssistem.dmvendas.repositories.SaleRepository;
import com.dmgraphicssistem.dmvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	/*
	 * Instanciado o SellerRepository para JPA gravar em Cache os vendedores
	 * Sendo assim os vendedores ratão sempre em memória 
	 */
	@Autowired
	private SellerRepository sellerRepository;
	/*
	 * Page e Pageable no Spring efetua a busca paginada
	 */
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable ) {
		sellerRepository.findAll();
		Page<Sale> resultBuscaBD = repository.findAll(pageable);
		/*
		 * Como Page e Pageable ja é uma Stream não efetua a converção 
		 * Lambda de Sale para SaleDTO
		 */
		return resultBuscaBD.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccesDTO> succesGroupBySeller() {
		return repository.succesGroupBySeller();
	}
}
