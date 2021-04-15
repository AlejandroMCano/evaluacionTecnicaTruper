package com.prueba.demo.dto;

public class PedidosDetalle {

	private int id;
	private String sku;
	private double amout;
	private double price;
	private String referencies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getReferencies() {
		return referencies;
	}
	public void setReferencies(String referencies) {
		this.referencies = referencies;
	}
	@Override
	public String toString() {
		return "PedidosDetalle [id=" + id + ", sku=" + sku + ", amout=" + amout + ", price=" + price + ", referencies="
				+ referencies + "]";
	}
	
	
	
}
