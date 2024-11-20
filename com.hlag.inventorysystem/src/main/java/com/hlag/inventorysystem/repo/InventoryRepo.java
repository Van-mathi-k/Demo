package com.hlag.inventorysystem.repo;

import java.util.Optional;
import java.util.UUID;

import com.hlag.inventorysystem.entity.Product;
import com.hlag.inventorysystem.exception.InvalidException;

public interface InventoryRepo {

	public Product addUser(Product product);

	public Optional<Product> getUserById(UUID productId);

	public boolean deleteUser(UUID productId);

	boolean updateUser(UUID productId, Product updatedProduct) throws InvalidException;


}
