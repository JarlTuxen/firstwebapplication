package com.example.demo.Service;

import com.example.demo.Model.Item;
import com.example.demo.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepo itemRepo;

    public List<Item> fetchAllItems(){

        return itemRepo.fetchAllItems();

    }

    public void addItem(Item item){
        itemRepo.addItem(item);
    }

    public void deleteItem(int id){
        itemRepo.deleteItem(id);
    }
}
