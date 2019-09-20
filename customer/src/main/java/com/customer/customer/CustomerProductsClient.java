package com.customer.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//Service Id of EmployeeSerach service
@FeignClient(name="products" )
public interface CustomerProductsClient {
	
	@RequestMapping(method = RequestMethod.GET, value ="/product-client")
	public ProductResponseDto getProductClient();
	
	@RequestMapping("/product-client-by-id")
	public ProductResponseDto getProductClient(@RequestParam("customer-id") Integer customerId);
}
