package com.mycompany.itemsservice.repository;

import com.mycompany.itemsservice.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

}
