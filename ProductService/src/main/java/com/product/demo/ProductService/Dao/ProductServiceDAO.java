package com.product.demo.ProductService.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.product.demo.ProductService.VO.ProductVO;

@Service
public class ProductServiceDAO {
	
	@Autowired(required=true)
	private JdbcTemplate jdbcTemplate;  
	
	public List<ProductVO> getProductDetails(){
		List<ProductVO> productVOs = new ArrayList<ProductVO>();
	 // SQL Operation #3 - SQL READ Operation
    String sqlSelectQuery = "SELECT prodNo,catNo,catNo FROM product";
    productVOs = jdbcTemplate.query(sqlSelectQuery, new RowMapper(){
    		public ProductVO mapRow(ResultSet result, int rowNum) throws SQLException {
    			ProductVO productVO = new ProductVO();
    			productVO.setProdNo(result.getString("prodNo"));
    			productVO.setCatNo(result.getString("catNo"));
    			productVO.setProdName(result.getString("catNo"));
            return productVO;
        }
    });
    return productVOs;
	}


}
