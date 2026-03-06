package edu.icet.service;

import edu.icet.model.Order;

import java.util.List;

public interface OrderService {
    boolean updateOrder(Order order);
    boolean addOrder(Order order);
    boolean deleteOrder(String id);
    List<Order> getOrder();
    Order searchById(String id);
}
