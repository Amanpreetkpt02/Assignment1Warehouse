package com.cpan252.Warehouse.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Item {
    private int id;
    private String name;
    private int yearofcreation;
    private double price;
    private FashionableBrand brand;

    public enum FashionableBrand{
        BALENCIAGA("BALENCIAGA" ),STONE("STONE"),ISLAND("ISLAND"),DIOR("DIOR"), DOLCEGABBANA("DOLCEGABBANA");

        private String title;
        
        private FashionableBrand(String title){
            this.title=title;
        }
        public String getTitle(){
            return title;
        }
    }
}