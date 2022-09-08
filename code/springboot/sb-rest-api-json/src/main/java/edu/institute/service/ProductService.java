package edu.institute.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.institute.dto.Product;

@Service
public class ProductService {

	public List<Product> productList() {
		Product p1 = new Product();
		p1.setId(121);
		p1.setName("Smart Watch");
		p1.setPrice(8878.30);
		p1.setQty(1);

		Product p2 = new Product();
		p2.setId(111);
		p2.setName("Smart Phone");
		p2.setPrice(18878.30);
		p2.setQty(1);
		
		Product p3 = new Product();
		p3.setId(78);
		p3.setName("Headphone");
		p3.setPrice(887.12);
		p3.setQty(5);
		
		return Arrays.asList(p1,p2,p3);
	}
	
}
