package edu.icet.service.Impl;

import edu.icet.model.Item;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public List<Item> getItem() {
        return itemRepository.getItem();
    }

    @Override
    public boolean addItem(Item item) {
        return itemRepository.addItem(item);
    }

    @Override
    public boolean updateItem(Item item) {
        return itemRepository.updateItem(item);
    }

    @Override
    public boolean deleteItem(String id) {
        return itemRepository.deleteItem(id);
    }

    @Override
    public Item searchById(String id) {
        return itemRepository.searchItemId(id);
    }
}

