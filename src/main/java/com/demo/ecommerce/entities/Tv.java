package com.demo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tv {
	@Id
	private int productId;
	private String brandName;
	private String type;
	private String displayType;
	private String displaySize;
	private int price;
	public Tv() {};
	public Tv(int productId, String brandName, String type, String displayType, String displaySize, int price) {
		super();
		this.productId = productId;
		this.brandName = brandName;
		this.type = type;
		this.displayType = displayType;
		this.displaySize = displaySize;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
