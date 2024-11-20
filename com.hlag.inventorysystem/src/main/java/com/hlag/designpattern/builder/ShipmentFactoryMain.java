package com.hlag.designpattern.builder;

public class ShipmentFactoryMain {

	// TODO Auto-generated method stub

	public static ShipmentFactory createShipment(String shipmentType) {
		switch (shipmentType.toLowerCase()) {
		case "air":
			return new AirShipment();
		case "sea":
			return new SeaShipment();
		case "land":
			return new LandShipment();
		default:
			throw new IllegalArgumentException("Invalid shipment type: " + shipmentType);
		}

	}

}
