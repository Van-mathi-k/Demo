package com.hlag.shippingmanagement.service;

import java.util.List;
import java.util.Optional;

import shippingmanagementsystem.userentity.OrderMaster;

public interface OrderMasterInterface {
	public OrderMaster createOrder(OrderMaster order);

	public Optional<OrderMaster> getOrderById(int orderId);

	public List<OrderMaster> getAllOrders();

	public boolean updateOrder(int orderId, OrderMaster updatedOrder);

	public boolean deleteOrder(int orderId);

	public List<OrderMaster> getOrdersByStatus(String status);
}
