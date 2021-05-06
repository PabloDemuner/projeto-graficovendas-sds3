package com.dmgraphicssistem.dmvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmgraphicssistem.dmvendas.dto.SellerDTO;
import com.dmgraphicssistem.dmvendas.entites.Seller;
import com.dmgraphicssistem.dmvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> resultBuscaBD = repository.findAll();

		/*
		 * Expressão Lambda que efetua a converção de Seller para SellerDTO
		 */
		return resultBuscaBD.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
