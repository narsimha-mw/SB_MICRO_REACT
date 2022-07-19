package com.retailer.warehouse.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailer_warehouse")
public class Warehouses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="warehouse_id")
	private Integer warehouseId;
	
	@Column(name="warehouse_name")
	private String warehouseName;
	
	@Column(name="warehouse_stock")
	private Long warehouseStock;
	
	@Column(name="warehouse_price")
	private Double warehousePrice;

	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Long getWarehouseStock() {
		return warehouseStock;
	}

	public void setWarehouseStock(Long warehouseStock) {
		this.warehouseStock = warehouseStock;
	}

	public Double getWarehousePrice() {
		return warehousePrice;
	}

	public void setWarehousePrice(Double warehousePrice) {
		this.warehousePrice = warehousePrice;
	}

	@Override
	public String toString() {
		return "Warehouses [warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", warehouseStock="
				+ warehouseStock + ", warehousePrice=" + warehousePrice + ", getWarehouseId()=" + getWarehouseId()
				+ ", getWarehouseName()=" + getWarehouseName() + ", getWarehouseStock()=" + getWarehouseStock()
				+ ", getWarehousePrice()=" + getWarehousePrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
