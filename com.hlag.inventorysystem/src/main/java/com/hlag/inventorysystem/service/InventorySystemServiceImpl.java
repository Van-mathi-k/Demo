package com.hlag.inventorysystem.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.hlag.inventorysystem.entity.Product;
import com.hlag.inventorysystem.exception.InvalidException;
import com.hlag.inventorysystem.repo.InventoryRepo;
import com.hlag.inventorysystem.repo.InventoryRepoImpl;

public class InventorySystemServiceImpl implements InventorySystemService {

	private static InventorySystemServiceImpl inventorySystemServiceImpl;
	private static InventoryRepo inventoryRepo = InventoryRepoImpl.getInstance();

	private Set<Product> users = new HashSet<>();

	@Override
	public Product addUser(Product product) {
		boolean result = users.add(product);
		if (result) {
			return product;
		}
		return null;
	}


	@Override
	public Optional<Product> getUserById(String productId) {
		try {
			UUID id = UUID.fromString(productId); // Convert string to UUID
			return inventoryRepo.getUserById(id);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid product ID format.");
			return Optional.empty();
		}
	}

	@Override
	public boolean deleteUser(String productId) {
		try {
			UUID id = UUID.fromString(productId); // Convert string to UUID
			boolean isDeleted = inventoryRepo.deleteUser(id);
			if (isDeleted) {
				System.out.println("Product deleted successfully.");
			} else {
				System.out.println("Product not found.");
			}
			return isDeleted;
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid product ID format.");
			return false;
		}
	}

	@Override
	public boolean updateUser(UUID productId, Product updatedProduct) throws InvalidException {
		boolean isUpdated = inventoryRepo.updateUser(productId, updatedProduct);
		if (isUpdated) {
			System.out.println("Product updated successfully.");
		} else {
			System.out.println("Product not found.");
			throw new InvalidException("Product not found or invalid data.");
		}
		return isUpdated;
	}

	public InventorySystemServiceImpl() {
	}

	public static InventorySystemServiceImpl getInstance() {
		if (inventorySystemServiceImpl == null) {
			inventorySystemServiceImpl = new InventorySystemServiceImpl();
		}
		return inventorySystemServiceImpl;
	}

}
