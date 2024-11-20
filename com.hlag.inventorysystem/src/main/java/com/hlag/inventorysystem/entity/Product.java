package com.hlag.inventorysystem.entity;

import java.util.UUID;

import com.hlag.inventorysystem.exception.InvalidException;

public class Product {

	private UUID productId;
	private String productName;
	private String productDescription;
	private double productCost;
	private String productQuantity;

	public Product(UUID productId, String productName, String productDescription, double productCost,
			String productQuantity) throws InvalidException {

		productId = UUID.randomUUID();
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
		setProductCost(productCost);
	}

	public UUID getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) throws InvalidException {
		if (productCost <= 0) {
			throw new InvalidException("Product cost must be a positive value.");
		}
		this.productCost = productCost;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productCost=" + productCost + ", productQuantity=" + productQuantity + "]";
	}

}
