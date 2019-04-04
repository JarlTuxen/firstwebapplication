package com.example.demo.Controller;

import com.example.demo.Model.Item;
import com.example.demo.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    ItemService itemService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("items", itemService.fetchAllItems());
        return "index";
    }

    @GetMapping("/create")
    public String showCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Item item){
        itemService.addItem(item);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        itemService.deleteItem(id);
        return "redirect:/";
    }

}
