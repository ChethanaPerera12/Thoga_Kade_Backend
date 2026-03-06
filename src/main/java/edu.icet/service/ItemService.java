package edu.icet.service;

import edu.icet.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItem();
    boolean addItem(Item item);
    boolean updateItem(Item item);
    boolean deleteItem(String id);
    Item searchById(String id);
}