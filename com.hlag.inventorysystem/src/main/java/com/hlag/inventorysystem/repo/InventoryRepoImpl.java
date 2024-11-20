package com.hlag.inventorysystem.repo;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.hlag.inventorysystem.entity.Product;
import com.hlag.inventorysystem.exception.InvalidException;

public class InventoryRepoImpl implements InventoryRepo {

	private static InventoryRepoImpl INVENTORY_REPO_IMPL;
	private Set<Product> products = new HashSet<>();

	@Override
	public Product addUser(Product product) {

		boolean result = products.add(product);
		if (result) {
			return product;
		}
		return null;
	}

	@Override
	public Optional<Product> getUserById(UUID productId) {
		return products.stream().filter(product -> product.getProductId().toString().equals(productId)).findFirst();

	}

	@Override
	public boolean updateUser(UUID productId, Product updatedProduct) throws InvalidException {
		Optional<Product> existingProductOpt = getUserById(productId);
		if (existingProductOpt.isPresent()) {
			Product existingProduct = existingProductOpt.get();
			existingProduct.setProductName(updatedProduct.getProductName());
			existingProduct.setProductDescription(updatedProduct.getProductDescription());
			existingProduct.setProductCost(updatedProduct.getProductCost());
			existingProduct.setProductQuantity(updatedProduct.getProductQuantity());

			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(UUID productId) {
		return products.removeIf(product -> product.getProductId().equals(productId));

	}

	public InventoryRepoImpl() {

	}

	public static InventoryRepoImpl getInstance() {
		if (INVENTORY_REPO_IMPL == null) {
			INVENTORY_REPO_IMPL = new InventoryRepoImpl();
		}
		return INVENTORY_REPO_IMPL;
	}


}
