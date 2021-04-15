package com.prueba.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.demo.dto.Pedidos;
import com.prueba.demo.service.PedidoService;

@RestController
public class PedidoController {

	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<?> guardar(@RequestBody Pedidos pedidos){
		pedidoService.save(pedidos);
		return (ResponseEntity<?>) ResponseEntity.ok();
		}
}
