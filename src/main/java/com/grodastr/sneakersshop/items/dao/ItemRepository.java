package com.grodastr.sneakersshop.items.dao;

import com.grodastr.sneakersshop.items.dao.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
