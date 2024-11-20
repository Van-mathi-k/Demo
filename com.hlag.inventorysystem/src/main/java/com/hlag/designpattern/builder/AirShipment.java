package com.hlag.designpattern.builder;

public class AirShipment implements ShipmentFactory {

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Delivering by air.");
	}

}
