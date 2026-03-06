package edu.icet.service.Impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public boolean updateOrder(Order order) {
        return orderRepository.updateOrder(order);
    }
    @Override
    public boolean addOrder(Order order) {
        return orderRepository.addOrder(order);
    }

    @Override
    public boolean deleteOrder(String id) {
        return orderRepository.deleteOrder(id);
    }

    @Override
    public List<Order> getOrder() {
        return orderRepository.getOrder();
    }

    @Override
    public Order searchById(String id) {
        return orderRepository.searchById(id);
    }
}
