package com.grodastr.sneakersshop.items.service;

import com.grodastr.sneakersshop.items.dao.ItemRepository;
import com.grodastr.sneakersshop.items.dao.entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository repository;

    public List<Item> findAllItems(){
        return repository.findAll();
    }

    public Item createItem(Item item){
        return repository.save(item);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
