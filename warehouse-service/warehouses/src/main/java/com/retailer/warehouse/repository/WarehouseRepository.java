package com.retailer.warehouse.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailer.warehouse.model.Warehouses;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouses, Integer> {

}
