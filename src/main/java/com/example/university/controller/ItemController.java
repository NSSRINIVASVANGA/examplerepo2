/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here

/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.university.controller;

import com.example.university.model.*;
import com.example.university.service.*;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return inventoryService.addItem(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        item.setId(id);
        return inventoryService.updateItem(item);
    }

    @DeleteMapping("/{id}")
    public void removeItem(@PathVariable Long id) {
        inventoryService.removeItem(id);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return inventoryService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return inventoryService.getItemById(id);
    }
}