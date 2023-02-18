package com.cpan252.Warehouse.controller;

import java.util.EnumSet;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.cpan252.Warehouse.model.Item;
import com.cpan252.Warehouse.model.Item.FashionableBrand;



import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/design")
@Slf4j
public class DesignController {
    @GetMapping
    public String design(){
       return "design";
    }
    @ModelAttribute
    public void items(Model model) {
        var items = EnumSet.allOf(FashionableBrand.class).stream()
                .map(FashionableBrand::getTitle).collect(Collectors.toList());
        model.addAttribute("items",items);
        log.info("Items converted to string:  {}", 
        items);}

    @ModelAttribute("item")
    public Item item(){
        return Item.builder() 
           .build();


    }
}
