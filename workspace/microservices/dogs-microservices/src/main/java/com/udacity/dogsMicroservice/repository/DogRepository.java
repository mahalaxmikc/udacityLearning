package com.udacity.client.repository;

import com.udacity.client.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface  ItemRepository extends CrudRepository<Item, Long> {
}
