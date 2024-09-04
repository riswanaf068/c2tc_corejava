package com.tnsif.sm.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository repo;

	

	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

    public Product get(Integer productId) {
    	return repo.findById(productId).get();
		 
	}

	public void save(Product product) {
		repo.save(product);
		
	}


	 public void delete(Integer productId) {
	        repo.deleteById(productId);
	    }

	
  


	 
}
