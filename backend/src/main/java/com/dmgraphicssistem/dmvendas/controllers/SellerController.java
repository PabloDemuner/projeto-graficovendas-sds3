package com.dmgraphicssistem.dmvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmgraphicssistem.dmvendas.dto.SellerDTO;
import com.dmgraphicssistem.dmvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;

	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> listDTO = service.findAll();
		return ResponseEntity.ok(listDTO);
	}
}
