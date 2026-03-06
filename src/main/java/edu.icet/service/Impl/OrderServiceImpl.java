package edu.icet.service.Impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public boolean updateOrder(Order order) {
        return false;
    }

    @Override
    public boolean addOrder(Order order) {
        return false;
    }

    @Override
    public boolean deleteOrder(String id) {
        return false;
    }

    @Override
    public List<Order> getOrder() {
        return List.of();
    }

    @Override
    public Order searchById(String id) {
        return null;
    }
}
