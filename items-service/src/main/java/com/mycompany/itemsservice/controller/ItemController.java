package com.mycompany.itemsservice.controller;

import com.mycompany.itemsservice.dto.ItemDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {
    
    @PostMapping("/items")
    public ResponseEntity<ItemDTO> addItem(@RequestBody ItemDTO ItemDTO) {
        System.out.println("Item created");
        ResponseEntity<ItemDTO> re = ResponseEntity.status(201).body(ItemDTO);
        return re;
    }

    @GetMapping("/items")
    public ResponseEntity<List<ItemDTO>> allItems(){
        List<ItemDTO> items = null;
        return ResponseEntity.status(200).body(items);
    }

}
