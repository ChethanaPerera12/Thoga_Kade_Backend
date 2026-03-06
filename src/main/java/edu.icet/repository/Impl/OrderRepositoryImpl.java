package edu.icet.repository.Impl;

import edu.icet.model.Order;
import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Order> getOrder() {
        String sql = "SELECT * FROM `orders`";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Order(
                        rs.getString(1),
                        rs.getDate(2),
                        rs.getString(3)
                )
        );
    }

    @Override
    public boolean updateOrder(Order order) {
        String sql = "UPDATE `orders` SET OrderDate=?, CustID=? WHERE OrderID=?";
        return jdbcTemplate.update(sql,
                order.getDate(),
                order.getCustomerId(),
                order.getId()
        ) > 0;
    }

    @Override
    public boolean deleteOrder(String id) {
        String sql = "DELETE FROM `orders` WHERE OrderID=?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    @Override
    public Order searchById(String id) {
        String sql = "SELECT * FROM `orders` WHERE OrderID=?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
                new Order(
                        rs.getString(1),
                        rs.getDate(2),
                        rs.getString(3)
                ), id);
    }

    @Override
    public boolean addOrder(Order order) {
        String sql  = "INSERT INTO `orders` VALUES(?,?,?)";
        return jdbcTemplate.update(sql,
                order.getId(),
                order.getDate(),
                order.getCustomerId()
        ) > 0;
    }
}
