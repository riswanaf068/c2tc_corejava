package com.tnsif.sm.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;

 
 @GetMapping("/products")
public List<Product> list(){
		return service.listAll();
	}
 @GetMapping("/products/{id}")
	public ResponseEntity<Product>get(@PathVariable Integer id )
		{
		try {
			Product product =service.get(id);
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		
		catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		 
	}
 @PostMapping("/products")
	public void add(@RequestBody Product product ) {
		service.save(product);
	}
 
 @PutMapping("/products/{id}")
 public  ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer id ){
		try {
			Product existproduct =service.get(id);
			service.save(product); 
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		
		catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		 
	}
 
 @DeleteMapping("/products/{id}")
 public void delete(@PathVariable Integer id) {
	 service.delete(productId);
 }
 
 
 
 
 
 
 
 
 
 
 
 
}
