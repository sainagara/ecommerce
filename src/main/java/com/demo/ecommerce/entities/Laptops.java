package com.demo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptops {
	@Id
	private int productId;
	private String brandName;
	private String os;
	private String processor;
	private String ram;
	private String displaySize;
	private String touchScreen;
	private int price;
	public Laptops() {};
	public Laptops(int productId, String brandName, String os, String processor, String ram, String displaySize,
			String touchScreen, int price) {
		super();
		this.productId = productId;
		this.brandName = brandName;
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.displaySize = displaySize;
		this.touchScreen = touchScreen;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public String getTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
