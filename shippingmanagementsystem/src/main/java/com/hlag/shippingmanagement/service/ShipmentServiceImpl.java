package com.hlag.shippingmanagement.service;

import java.util.List;
import java.util.Optional;

import shippingmanagementsystem.userentity.ShipmentMaster;

public class ShipmentServiceImpl implements ShipmentServiceInterface {

	@Override
	public ShipmentMaster scheduleShipment(ShipmentMaster shipment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ShipmentMaster> getShipmentById(int shipmentId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<ShipmentMaster> getAllShipments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateShipment(int shipmentId, ShipmentMaster updatedShipment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteShipment(int shipmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ShipmentMaster> getShipmentsByDriver(String driverName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShipmentMaster> getShipmentsByOrder(String order) {
		// TODO Auto-generated method stub
		return null;
	}

}
