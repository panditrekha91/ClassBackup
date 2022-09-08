package edu.institute.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.dto.Product;
import edu.institute.service.ProductService;

@RestController
@Validated
public class ProductController {

	@Autowired
	private ProductService productService;
	
	// return response in JSON
	@GetMapping("/get-all-product")
	public List<Product> getProductList() {
		return productService.productList();
	}
	
	
	// @RequestBody : This annotation is responsible to accept a JSON and convert it into a java object also It will set all the JSON values into java variable.
	// Accept JSON as a request
	@PostMapping("/product-info")
	public String getProduct(@RequestBody Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "Failed";
		} else {
			System.out.println("Id : " + product.getId());
			System.out.println("Name : " + product.getName());
			System.out.println("Price : " + product.getPrice());
			System.out.println("Quantity : " + product.getQty());
			return "Success";
		}
	}
	
	
}
