package com.hlag.inventorysystem.service;

import java.util.Optional;
import java.util.UUID;

import com.hlag.inventorysystem.entity.Product;
import com.hlag.inventorysystem.exception.InvalidException;

public interface InventorySystemService {
	public Product addUser(Product product);

	public Optional<Product> getUserById(String id);

	public boolean deleteUser(String productId);

	boolean updateUser(UUID productId, Product updatedProduct) throws InvalidException;
}
