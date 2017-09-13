package com.Inventary.bean;

public class OrderDetailsBean {
 	private int id;
 	private int orderId;
 	private int productId;
 	private String productName;
 	private int quantity;
 	private Double singlePrice;
 	private Double productTax;
 	private Double rowTotal;
 	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		//System.out.println("GetproductId: "+productId);
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
		//System.out.println("SetproductId: "+this.productId);
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getSinglePrice() {
		return singlePrice;
	}
	public void setSinglePrice(Double singlePrice) {
		this.singlePrice = singlePrice;
	}
	public Double getProductTax() {
		return productTax;
	}
	public void setProductTax(Double productTax) {
		this.productTax = productTax;
	}
	public Double getRowTotal() {
		return rowTotal;
	}
	public void setRowTotal(Double rowTotal) {
		this.rowTotal = rowTotal;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
