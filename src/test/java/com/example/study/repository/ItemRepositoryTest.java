package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {

        Item item = new Item();
        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("LG 노트북");

        Item newItem = itemRepository.save(item);

    }

    @Test
    public void read() {

    }
}
