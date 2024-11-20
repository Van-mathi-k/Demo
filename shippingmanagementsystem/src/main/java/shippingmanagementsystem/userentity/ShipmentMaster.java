package shippingmanagementsystem.userentity;

import java.util.Objects;

public class ShipmentMaster {
	private int id;
	private String order;
	private int trackingNumber;
	private String assignedDriver;

	public ShipmentMaster() {

	}

	public ShipmentMaster(int id, String order, int trackingNumber, String assignedDriver) {
		super();
		this.id = id;
		this.order = order;
		this.trackingNumber = trackingNumber;
		this.assignedDriver = assignedDriver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getAssignedDriver() {
		return assignedDriver;
	}

	public void setAssignedDriver(String assignedDriver) {
		this.assignedDriver = assignedDriver;
	}

	@Override
	public String toString() {
		return "ShipmentMaster [id=" + id + ", order=" + order + ", trackingNumber=" + trackingNumber
				+ ", assignedDriver=" + assignedDriver + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(assignedDriver, id, order, trackingNumber);
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
		ShipmentMaster other = (ShipmentMaster) obj;
		return Objects.equals(assignedDriver, other.assignedDriver) && id == other.id
				&& Objects.equals(order, other.order) && trackingNumber == other.trackingNumber;
	}

}
