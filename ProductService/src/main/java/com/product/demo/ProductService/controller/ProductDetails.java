package com.product.demo.ProductService.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.demo.ProductService.Dao.ProductServiceDAO;
import com.product.demo.ProductService.VO.ProductVO;

@RestController
public class ProductDetails {
	
	@Autowired(required=true)
	ProductServiceDAO productServiceDAO;
	
	@RequestMapping("/products")
	public List<ProductVO> getProductDetails(){
		List<ProductVO> productVOs = productServiceDAO.getProductDetails();
		
		return productVOs;
	}

}
