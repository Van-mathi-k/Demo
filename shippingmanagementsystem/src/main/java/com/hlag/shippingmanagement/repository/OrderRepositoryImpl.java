package com.hlag.shippingmanagement.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.naming.InvalidNameException;

import shippingmanagementsystem.userentity.OrderMaster;

public class OrderRepositoryImpl implements OrderRepositoryInterface {
	List<OrderMaster> masters = new ArrayList<>();

	@Override
	public OrderMaster createOrder(OrderMaster order) {
		// TODO Auto-generated method stub
		masters.add(order);
		return order;
	}

	@Override
	public Optional<OrderMaster> getOrderById(int orderId) {
		// TODO Auto-generated method stub

		return masters.stream().filter(orderid -> orderid.getOrderId() == orderId).findFirst();

	}

	@Override
	public List<OrderMaster> getAllOrders() {
		// TODO Auto-generated method stub
		return new ArrayList<>(masters);
	}

	@Override
	public OrderMaster updateOrder(int orderId, OrderMaster updatedOrder) {
		// TODO Auto-generated method stub

		Optional<OrderMaster> optional = getOrderById(orderId);
		if (optional.isPresent()) {
			masters.add(updatedOrder);
		}

		return updatedOrder;
	}

	@Override
	public boolean deleteOrder(int orderId) {
		return masters.removeIf(ord -> ord.getOrderId() == orderId);
	}

	@Override
	public List<OrderMaster> getOrdersByStatus(String status) throws InvalidNameException {
		if (status == null || status.isEmpty()) {
			throw new InvalidNameException("Status cannot be null or empty");
		}
		return masters.stream().filter(e -> e.getStatus().equalsIgnoreCase(e.getStatus())).collect(Collectors.toList());
	}

}
