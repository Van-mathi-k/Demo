package com.hlag.shippingmanagement.service;

import java.util.List;
import java.util.Optional;

import shippingmanagementsystem.userentity.OrderMaster;

public class OrderMasterImpl implements OrderMasterInterface {

	@Override
	public OrderMaster createOrder(OrderMaster order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OrderMaster> getOrderById(int orderId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<OrderMaster> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(int orderId, OrderMaster updatedOrder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderMaster> getOrdersByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
