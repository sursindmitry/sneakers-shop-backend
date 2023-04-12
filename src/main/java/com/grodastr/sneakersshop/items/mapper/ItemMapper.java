package com.grodastr.sneakersshop.items.mapper;

import com.grodastr.sneakersshop.items.dao.entity.Item;
import com.grodastr.sneakersshop.items.dto.ItemDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto toDto(Item source);

    Item toEntity(ItemDto source);
}
