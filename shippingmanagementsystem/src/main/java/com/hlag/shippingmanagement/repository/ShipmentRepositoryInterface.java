package com.hlag.shippingmanagement.repository;

import java.util.List;
import java.util.Optional;

import shippingmanagementsystem.userentity.ShipmentMaster;

public interface ShipmentRepositoryInterface {
	public ShipmentMaster scheduleShipment(ShipmentMaster shipment);

	public Optional<ShipmentMaster> getShipmentById(int shipmentId);

	public List<ShipmentMaster> getAllShipments();

	public boolean updateShipment(int shipmentId, ShipmentMaster updatedShipment);

	public boolean deleteShipment(int shipmentId);

	public List<ShipmentMaster> getShipmentsByDriver(String driverName);

	public List<ShipmentMaster> getShipmentsByOrder(String order);

}
