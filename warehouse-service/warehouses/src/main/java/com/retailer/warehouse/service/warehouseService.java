package com.retailer.warehouse.service;

import org.springframework.stereotype.Service;

import com.retailer.warehouse.model.Warehouses;

@Service
public interface warehouseService {

	Warehouses save(Warehouses warehouses);

}
