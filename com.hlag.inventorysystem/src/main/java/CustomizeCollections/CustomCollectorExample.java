package CustomizeCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

//Scenario: Grouping products by price range and 
//calculating total value per range
//We want to:
//Group products into price ranges (<50, 50-100, >100).
//Use a custom collector to compute the total
//value of products in each range.

public class CustomCollectorExample {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Laptop", 1200), new Product("Mouse", 20),
				new Product("Keyboard", 50), new Product("Monitor", 200), new Product("Charger", 30));

		// Custom Collector
//		Map<String, Double> priceRangeTotals = products.stream().collect();

//		System.out.println("Total value by price range: " + priceRangeTotals);

		Map<String, Double> priceRangeTotals1 = products.stream().collect(Collectors.groupingBy(p -> {
			if (p.getPrice() < 50) {
				return "<50";
			} else if (p.getPrice() < 100) {
				return "50-100";
			} else {
				return ">100";
			}

		}, Collector.of(() -> new double[1], (a, p) -> a[0] += p.getPrice(), (a1, a2) -> {
			a1[0] += a2[0];
			return a1;
		}, a -> a[0])));
		System.out.println("total value by price range" + priceRangeTotals1);
	}

}