package com.hlag.designpattern.builder;

public class FactoryMain {
	public static void main(String[] args) {
				// Create different shipments using the factory
				ShipmentFactory airShipment = ShipmentFactoryMain.createShipment("air");
				ShipmentFactory seaShipment = ShipmentFactoryMain.createShipment("sea");
				ShipmentFactory landShipment = ShipmentFactoryMain.createShipment("land");
	
				// Deliver the shipments
				airShipment.deliver();
				seaShipment.deliver();
				landShipment.deliver();
			}
}

