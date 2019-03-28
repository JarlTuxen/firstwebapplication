package com.example.demo.Repository;

import com.example.demo.Model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepo {

    public List<Item> fetchAllItems(){

        //this is where the DB communication will be done

        List<Item> items = new ArrayList<>();

        items.add(new Item("PC", 100));
        items.add(new Item("LapTop", 150));
        items.add(new Item("Tablet", 125));

        return items;
    }
}
