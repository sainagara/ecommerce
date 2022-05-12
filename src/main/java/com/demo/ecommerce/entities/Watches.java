package com.demo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Watches {
	@Id
	private int productId;
	private String productName;
	private String watchType;
	private String bandType;
	private String waterResistant;
	private int price;
	public Watches() {};
	public Watches(int productId, String productName, String watchType, String bandType, String waterResistant,
			int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.watchType = watchType;
		this.bandType = bandType;
		this.waterResistant = waterResistant;
		this.price = price;
	}
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
