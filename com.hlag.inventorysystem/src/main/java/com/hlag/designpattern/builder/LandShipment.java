package com.hlag.designpattern.builder;

public class LandShipment implements ShipmentFactory {

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Delivering by land.");
	}

}

