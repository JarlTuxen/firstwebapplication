package com.example.demo.Service;

import com.example.demo.Model.Item;
import com.example.demo.Repository.ItemRepo;
import com.example.demo.Repository.ItemRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepoJPA itemRepo;
    //ItemRepo itemRepo;


    public List<Item> fetchAllItems(){

        //return itemRepo.fetchAllItems();
        return itemRepo.findAll();

    }

    public void addItem(Item item){
        //itemRepo.addItem(item);
        itemRepo.save(item);
    }

    public void deleteItem(int id){
        //itemRepo.deleteItem(id);
        itemRepo.deleteById(id);
    }

    public Item findItemById(int id){
        //return itemRepo.findItemById(id);
        return itemRepo.getOne(id);
    }

    public void updateItem(Item item){
        //itemRepo.updateItem(item);
        itemRepo.save(item);
    }
}
