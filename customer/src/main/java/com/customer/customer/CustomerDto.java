package com.customer.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDto {
	
	@JsonProperty(value="customer-id")
	private Integer customerId;
	
	@JsonProperty(value="customer-name")
	private String customerName;
	
	private ProductResponseDto products;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ProductResponseDto getProducts() {
		return products;
	}

	public void setProducts(ProductResponseDto products) {
		this.products = products;
	}
	
	
}
