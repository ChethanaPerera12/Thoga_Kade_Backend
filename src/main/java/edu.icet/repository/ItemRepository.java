package edu.icet.repository;

import edu.icet.model.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> getItem();

    boolean addItem(Item item);

    boolean updateItem(Item item);

    boolean deleteItem(String id);

    Item searchItemId(String id);
}
