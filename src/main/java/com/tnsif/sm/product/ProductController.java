package com.tnsif.sm.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProductController {
	@Autowired
	private ProductService service;

 
 @GetMapping("/products")
public List<Product> list(){
		return service.listAll();
	}
 @GetMapping("/products/{id}")
	public ResponseEntity<Product>get(@PathVariable Integer productId)
		{
		try {
			Product product =service.get(productId);
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
 
 @PutMapping("/products/{productId}")
 public  ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer productId ){
		try {
			Product existproduct =service.get(productId);
			service.save(product); 
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		
		catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		 
	}


 @DeleteMapping("/products/{productId}")
 public void delete(@PathVariable Integer productId) {
	 service.delete(productId);
	
 }                                                                              
                                                                                          
}
 
 
 
 
 
 
 

