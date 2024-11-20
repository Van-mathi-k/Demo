package com.hlag.shippingmanagement.repository;

import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import shippingmanagementsystem.userentity.OrderMaster;

public interface OrderRepositoryInterface {
	public OrderMaster createOrder(OrderMaster order);

	public Optional<OrderMaster> getOrderById(int orderId);

	public List<OrderMaster> getAllOrders();

	public OrderMaster updateOrder(int orderId, OrderMaster updatedOrder);

	public boolean deleteOrder(int orderId);

	public List<OrderMaster> getOrdersByStatus(String status) throws InvalidNameException;
}
