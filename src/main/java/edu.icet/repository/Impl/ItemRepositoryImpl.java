package edu.icet.repository.Impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Item> getItem() {
        String sql = "SELECT * FROM item";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Item(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5)

                ));
    }

    @Override
    public boolean addItem(Item item) {
        String sql ="INSERT INTO item VALUES(?????)";
        return jdbcTemplate.update(sql,
                item.getItemCode(),
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand()
        ) > 0;
    }

    @Override
    public boolean updateItem(Item item) {
        String sql = "UPDATE item SET Description=?,PackSize=?,UnitPrice=?,QtyOnHand=? WHERE ItemCode=?";
        return jdbcTemplate.update(sql,
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand(),
                item.getItemCode()

                )>0;
    }

    @Override
    public boolean deleteItem(String id) {
        String sql ="DELETE FROM item WHERE ItemCode=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public Item searchItemId(String id) {
        String sql = "SELECT * FROM item WHWRE ItemCode";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Item(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5)
        ),id);
    }
}
