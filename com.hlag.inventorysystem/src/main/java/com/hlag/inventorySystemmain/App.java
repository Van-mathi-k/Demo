package com.hlag.inventorySystemmain;

import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

import com.hlag.inventorysystem.entity.Product;
import com.hlag.inventorysystem.exception.InvalidException;
import com.hlag.inventorysystem.service.InventorySystemService;
import com.hlag.inventorysystem.service.InventorySystemServiceImpl;

public class App {

	private static InventorySystemService inventorySystemService = InventorySystemServiceImpl.getInstance();

	public static void main(String[] args) throws InvalidException {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Product ID: ");

		while (true) {
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addProduct(scanner);
				break;
			case 2:
				viewProductById();
				break;

			case 4:
				updateProduct(scanner);
				break;
			case 5:
				deleteProduct(scanner);
				break;
			case 6:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private static void showMenu() {
		System.out.println("\n--- Inventory System ---");
		System.out.println("1. Add Product");
		System.out.println("2. View Products");
		System.out.println("3. View Product by ID");
		System.out.println("4. Update Product");
		System.out.println("5. Delete Product");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}

	private static Product addProduct(Scanner scanner) throws InvalidException {
		System.out.println("\nEnter Product Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Product Description: ");
		String description = scanner.nextLine();
		System.out.println("Enter Product Cost: ");
		double cost = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Quantity: ");
		String quantity = scanner.nextLine();

		Product product = new Product(UUID.randomUUID(), name, description, cost, quantity);
		inventorySystemService.addUser(product);

		System.out.println("Product added successfully.");
		return product;
	}

	private static void updateProduct(Scanner scanner) throws InvalidException {
		System.out.print("\nEnter Product ID (UUID) to update: ");
		String id = scanner.nextLine();
		Product product = new Product(UUID.randomUUID(), "Product Name", "Product Description", 100.0, "10");
		inventorySystemService.getUserById(product.getProductId().toString()).orElse(null);
		if (product != null) {
			System.out.println("Current details: " + product);
			System.out.print("New Name: ");
			product.setProductName(scanner.nextLine());
			System.out.print("New Description: ");
			product.setProductDescription(scanner.nextLine());
			System.out.print("New Cost: ");
			product.setProductCost(scanner.nextDouble());
			scanner.nextLine(); // Consume newline character
			System.out.print("New Quantity: ");
			product.setProductQuantity(scanner.nextLine());

			inventorySystemService.updateUser(UUID.fromString(id), product);
			System.out.println("Product updated successfully.");
		} else {
			System.out.println("Product not found.");
		}
	}

	private static void viewProductById() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		String productIdStr = scanner.nextLine();

		try {
			UUID productId = UUID.fromString(productIdStr);
			Optional<Product> product = inventorySystemService.getUserById(productIdStr);

			if (product.isPresent()) {
				System.out.println("Product found: " + product.get());
			} else {
				System.out.println("Product not found with ID: " + productId);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Product ID format.");
		}
	}

	private static void deleteProduct(Scanner scanner) {
		System.out.print("\nEnter Product ID (UUID) to delete: ");
		String id = scanner.nextLine();

		boolean isDeleted = inventorySystemService.deleteUser(id);
		if (isDeleted) {
			System.out.println("Product deleted successfully.");
		} else {
			System.out.println("Product not found.");
		}
	}
}
