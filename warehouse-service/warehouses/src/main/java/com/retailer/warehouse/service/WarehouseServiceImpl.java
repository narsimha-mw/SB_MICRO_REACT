package com.retailer.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.retailer.warehouse.model.Warehouses;
import com.retailer.warehouse.repository.WarehouseRepository;
@Component
public class WarehouseServiceImpl implements warehouseService {

	@Autowired
	private WarehouseRepository warehouseRepository;
	@Override
	public Warehouses save(Warehouses warehouse) {
		// TODO Auto-generated method stub
		return warehouseRepository.save(warehouse);
	}

}
