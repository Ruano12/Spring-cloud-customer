package com.customer.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerFacade {
	
	@Autowired
	private CustomerProductsClient proxy;
	
	public CustomerDto getCustomerAndProducts() {
		CustomerDto dto = new CustomerDto();
		ProductResponseDto products = proxy.getProductClient();
		
		dto.setCustomerId(1);
		dto.setCustomerName("Marcelo Benjamim");
		dto.setProducts(products);
		
		return dto;
	}
	
	public CustomerDto getCustomerIdAndProducts(Integer customerId) {
		CustomerDto dto = new CustomerDto();
		ProductResponseDto products = proxy.getProductClient(customerId);
		
		dto.setCustomerId(customerId);
		dto.setCustomerName("Marcelo Benjamim");
		dto.setProducts(products);
		
		return dto;
	}
}
