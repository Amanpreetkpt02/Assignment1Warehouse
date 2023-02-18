package com.cpan252.Warehouse.model;
import java.util.List;
import lombok.Data;
import java.util.ArrayList;
@Data
public class ItemPool {
    
    private List <Item> items;

    public ItemPool(){ 
        this.items = new ArrayList<>();
    }
    public void add (Item item){
        this.items.add(item);
    }
}
