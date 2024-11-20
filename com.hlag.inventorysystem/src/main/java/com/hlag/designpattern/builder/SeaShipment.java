package com.hlag.designpattern.builder;

public class SeaShipment implements ShipmentFactory {

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Delivering by sea.");
	}

}
