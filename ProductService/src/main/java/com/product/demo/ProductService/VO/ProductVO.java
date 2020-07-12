package com.product.demo.ProductService.VO;

public class ProductVO {

	private String prodNo;
	private String catNo;
	private String prodName;
	
	public ProductVO(){
		
	}
	
	public ProductVO(String prodNo,String catNo,String prodName){
		this.prodNo =prodNo;
		this.catNo =catNo;
		this.prodName=prodName;
	}

	public String getProdNo() {
		return prodNo;
	}

	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getCatNo() {
		return catNo;
	}

	public void setCatNo(String catNo) {
		this.catNo = catNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	
	
}
