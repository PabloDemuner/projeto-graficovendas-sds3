package com.dmgraphicssistem.dmvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmgraphicssistem.dmvendas.dto.SaleDTO;
import com.dmgraphicssistem.dmvendas.dto.SaleSuccesDTO;
import com.dmgraphicssistem.dmvendas.dto.SaleSumDTO;
import com.dmgraphicssistem.dmvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	/*
	 * Page e Pageable no Spring efetua a busca paginada
	 */
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> listDTO = service.findAll(pageable);
		return ResponseEntity.ok(listDTO);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
		List<SaleSumDTO> listDTO = service.amountGroupBySeller();
		return ResponseEntity.ok(listDTO);
	}
	
	@GetMapping(value = "/succes-by-seller")
	public ResponseEntity<List<SaleSuccesDTO>> succesGroupBySeller() {
		List<SaleSuccesDTO> listDTO = service.succesGroupBySeller();
		return ResponseEntity.ok(listDTO);
	}
}
