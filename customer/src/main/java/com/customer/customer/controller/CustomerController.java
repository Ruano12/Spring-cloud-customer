package com.customer.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customer.CustomerDto;
import com.customer.customer.CustomerFacade;
import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerFacade customerFacade;
	
	@GetMapping
    public ImmutableMap<Long,String> findAll() {
        return ImmutableMap.of(
            1L, "Customer 1",
            2L, "Customer 2",
            3L, "Customer 3",
            4L, "Customer 4");
    }
	
	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public CustomerDto getCustomerAndProducts() {
		return customerFacade.getCustomerAndProducts();
	}
	
	@RequestMapping(value = "/product-by-customer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public CustomerDto getCustomerIdAndProducts(@RequestParam("customer-id") Integer customerId) {
		return customerFacade.getCustomerIdAndProducts(customerId);
	}
}
