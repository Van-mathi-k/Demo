package stream;

public class Delivery {

	private String deliveryId;
	private boolean completed;
	private double deliveryTimeInHours;
	private double parcelWeight;
	private double revenue;

	public Delivery(String deliveryId, boolean completed, double deliveryTimeInHours, double parcelWeight,
			double revenue) {

		this.deliveryId = deliveryId;
		this.completed = completed;
		this.deliveryTimeInHours = deliveryTimeInHours;
		this.parcelWeight = parcelWeight;
		this.revenue = revenue;
	}

	public Delivery() {

	}

	public String getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public double getDeliveryTimeInHours() {
		return deliveryTimeInHours;
	}

	public void setDeliveryTimeInHours(double deliveryTimeInHours) {
		this.deliveryTimeInHours = deliveryTimeInHours;
	}

	public double getParcelWeight() {
		return parcelWeight;
	}

	public void setParcelWeight(double parcelWeight) {
		this.parcelWeight = parcelWeight;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", completed=" + completed + ", deliveryTimeInHours="
				+ deliveryTimeInHours + ", parcelWeight=" + parcelWeight + ", revenue=" + revenue + "]";
	}

}
