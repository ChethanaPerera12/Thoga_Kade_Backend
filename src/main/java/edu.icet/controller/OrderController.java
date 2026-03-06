package edu.icet.controller;

import edu.icet.model.Order;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("get-all")
    public List<Order> getOreder() {
        return orderService.getOrder();
    }

    @PutMapping("/update-order")
    public boolean updateOrder(@RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @PostMapping("/add-order")
    public boolean addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @DeleteMapping("/delete-order-id/{id}")
    public boolean deleteOrder(@PathVariable String id) {
        return orderService.deleteOrder(id);
    }

    @GetMapping("/search-order-id/{id}")
    public Order searchById(@PathVariable String id) {
        return orderService.searchById(id);
    }
}