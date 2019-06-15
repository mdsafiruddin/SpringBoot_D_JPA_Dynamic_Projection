package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	<T> List<T> findByProdCode(String prodCode,Class<T> cls);
	 <T> List<T> findByProdId(Integer prodId,Class<T> cls);
	 <T> List<T> findByProdModel(String prodModel,Class<T> cls);
	
	interface mydata{
		String getProdCode();
	    String getProdModel();
		
	}
	interface myName{
		String getProdId();
	    String getProdVendor();
		
	}
	interface myView{
		String getProdModel();
		Double getProdCost();
		
	}
	
	
	
	
	
}
