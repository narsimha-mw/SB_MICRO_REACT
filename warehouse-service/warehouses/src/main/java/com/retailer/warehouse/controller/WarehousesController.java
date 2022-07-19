package com.retailer.warehouse.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.warehouse.model.Warehouses;
import com.retailer.warehouse.service.warehouseService;

@RestController
@RequestMapping("/warehouses")
public class WarehousesController {
	
	@Autowired
	private warehouseService warehouseService;
	
	@PostMapping("/save")
	public Warehouses save(@RequestBody Warehouses warehouses) {
	return warehouseService.save(warehouses);		
	}
	@GetMapping("/test")
	public String test() {
	return "working fine has expeted warehouses..good";
	}
}
