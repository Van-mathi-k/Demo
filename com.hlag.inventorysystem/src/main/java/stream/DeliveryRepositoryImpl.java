package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hlag.inventorysystem.exception.InvalidException;

public class DeliveryRepositoryImpl implements DeliveryRepository {

	private List<Delivery> deliveries = new ArrayList<>();

	// Save a new delivery
	@Override
	public void save(Delivery delivery) {
		// deliveries.add(delivery);
	}

	// Find a delivery by its ID
	@Override
	public Optional<Delivery> findById(String deliveryId) {
		return deliveries.stream().filter(delivery -> delivery.getDeliveryId().equals(deliveryId)).findFirst();
	}

	// Get all deliveries
	@Override
	public List<Delivery> findAll() {
		return new ArrayList<>(deliveries);
	}

	// Update an existing delivery
	@Override
	public void update(Delivery delivery) {
		Optional<Delivery> existingDelivery = findById(delivery.getDeliveryId());
		if (existingDelivery.isPresent()) {
			deliveries.remove(existingDelivery.get());
			deliveries.add(delivery);
		}

	}

	// Delete a delivery by its ID
	// if we are going to delete using rormove if
	@Override
	public void deleteById(String deliveryId) {
		deliveries.removeIf(delivery -> delivery.getDeliveryId().equals(deliveryId));
	}

	// Get deliveries that are completed
	@Override
	public List<Delivery> findCompletedDeliveries() {
		List<Delivery> completedDeliveries = new ArrayList<>();
		for (Delivery delivery : deliveries) {
			if (delivery.isCompleted()) {
				completedDeliveries.add(delivery);
			}
		}
		List<Delivery> completedDeliveries1 = completedDeliveries.stream().filter(e -> e.isCompleted())
				.collect(Collectors.toList());

		return completedDeliveries1;
	}

	public void getRevenue() {
		List<Delivery> listDelivery = deliveries.stream().filter(e -> e.getRevenue() > 50).collect(Collectors.toList());
		System.out.println(listDelivery);
	}

	public List<Delivery> updateDelivery(String deliveryId) {
		return deliveries.stream().map(e -> {
			if (deliveryId.equals(e.getDeliveryId()) && !e.isCompleted()) {
				e.setCompleted(true);
			}
			return e; // Return the updated delivery
		}).collect(Collectors.toList());

	}

	public void updateDeliverys(String deliveryId) {

		List<Delivery> listDelivery = deliveries.stream()
				.filter(e -> e.getDeliveryId().equals(e.getDeliveryId()) && !e.isCompleted())
				.collect(Collectors.toList());

		listDelivery.removeAll(listDelivery);
	}

	@Override
	public List<Delivery> updateDelivery() {
		// TODO Auto-generated method stub
		return null;
	}

	public double calculateAverageDeleivery() throws InvalidException {

		deliveries.stream().mapToDouble(e -> e.getDeliveryTimeInHours()).average().

				orElseThrow(() -> new InvalidException("data is not provieded"));

		return deliveries.stream().mapToDouble(e -> e.getRevenue()).sum();
	}

	public double calculateTotalRevenue() {
		return deliveries.stream().mapToDouble(e -> e.getRevenue()).sum();
	}

	public List<Delivery> findTopKperformingDeliveries(int k) {
		return deliveries.stream().filter(Delivery::isCompleted)
				.sorted((a, b) -> Double.compare(a.getDeliveryTimeInHours(), b.getDeliveryTimeInHours())).limit(k)
				.collect(Collectors.toList());
	}
}
