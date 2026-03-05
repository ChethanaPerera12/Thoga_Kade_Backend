package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/get-all-items")
    public List<Item> getItem(){
        return itemService.getItem();
    }
    @PostMapping("/add-item")
    public boolean addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PutMapping("/update-item")
    public boolean updateItem(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

    @DeleteMapping("/delete-item-id/{id}")
    public boolean deleteItem(@PathVariable String id) {
        return itemService.deleteItem(id);
    }

    @GetMapping("/search-item-id/{id}")
    public Item searchById(@PathVariable String id) {
        return itemService.searchById(id);
    }
}
