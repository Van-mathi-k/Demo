package FunctionalInterfaceTask;

public class Cargo {
	private String cargoId;
	private String description;
	private int weight = 50;
	private int distance = 20;

	public Cargo(String cargoId, String description, int weight, int distance) {

		this.cargoId = cargoId;
		this.description = description;
		this.weight = weight;
		this.distance = distance;
	}

	public String getCargoId() {
		return cargoId;
	}

	public void setCargoId(String cargoId) {
		this.cargoId = cargoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void displayDetails() {
		System.out.println("Cargo ID: " + cargoId + ", Description: " + description + ", Weight: " + weight);
	}

	public double calculateShippingCost() {
		double ratePerKgPerKm = 0.1;
		return weight * distance * ratePerKgPerKm;

	}

	@Override
	public String toString() {
		return "Cargo [cargoId=" + cargoId + ", description=" + description + ", weight=" + weight + ", distance="
				+ distance + "]";
	}

//	@Override
//	public void trackCargo() {
//		// TODO Auto-generated method stub
//		System.out.println("Tracking cargo ID: " + cargoId);
//
//	}
}
