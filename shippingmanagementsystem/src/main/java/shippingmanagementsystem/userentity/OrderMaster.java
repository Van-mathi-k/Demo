package shippingmanagementsystem.userentity;

import java.util.Objects;

public class OrderMaster {
	private int orderId;

	private String customer;
	private String destination;
	private double weight;
	private String status;

	public OrderMaster() {

	}

	public OrderMaster(int orderId, String customer, String destination, double weight, String status) {

		this.orderId = orderId;
		this.customer = customer;
		this.destination = destination;
		this.weight = weight;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderMaster [orderId=" + orderId + ", customer=" + customer + ", destination=" + destination
				+ ", weight=" + weight + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, destination, orderId, status, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OrderMaster other = (OrderMaster) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(destination, other.destination)
				&& orderId == other.orderId && Objects.equals(status, other.status)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

}
