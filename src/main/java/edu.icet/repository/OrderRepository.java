package edu.icet.repository;

import edu.icet.model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> getOrder();
    boolean updateOrder(Order order);
    boolean deleteOrder(String id);
    Order searchById(String id);
    boolean addOrder(Order order);
}
