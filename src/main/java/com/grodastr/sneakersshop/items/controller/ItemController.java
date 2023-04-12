package com.grodastr.sneakersshop.items.controller;

import com.grodastr.sneakersshop.items.dao.entity.Item;
import com.grodastr.sneakersshop.items.dto.ItemDto;
import com.grodastr.sneakersshop.items.mapper.ItemMapper;
import com.grodastr.sneakersshop.items.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService service;

    private final ItemMapper mapper;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all")
    public List<ItemDto> getAllItems() {
        return service.findAllItems().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/add")
    public ItemDto create(@RequestBody @Valid ItemDto itemDto){
        Item persistedItem = service.createItem(mapper.toEntity(itemDto));
        return mapper.toDto(persistedItem);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/delete{id}")
    public void deleteItem(@PathVariable("id") Long id){
        service.deleteById(id);
    }
}

