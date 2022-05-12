package com.demo.ecommerce.dto;

public class WatchDto {
	private int productId;
	private String productName;
	private String watchType;
	private String bandType;
	private String waterResistant;
	private int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getWatchType() {
		return watchType;
	}
	public void setWatchType(String watchType) {
		this.watchType = watchType;
	}
	public String getBandType() {
		return bandType;
	}
	public void setBandType(String bandType) {
		this.bandType = bandType;
	}
	public String getWaterResistant() {
		return waterResistant;
	}
	public void setWaterResistant(String waterResistant) {
		this.waterResistant = waterResistant;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
