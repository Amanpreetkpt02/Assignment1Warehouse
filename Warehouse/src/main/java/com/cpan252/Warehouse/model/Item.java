package com.cpan252.Warehouse.model;

import java.util.Arrays;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Item {
    private int id;
    private String name;
    @Min(2021)
    private int yearofcreation;
    @Min(1000)
    private double price;
    private FashionableBrand brand;
    
    public Item(int id, String name, int yearofcreation, double price, FashionableBrand brand){
    if (!Arrays.asList(FashionableBrand.values()).contains(brand)) {
        throw new IllegalArgumentException("Invalid brand name, must be one of: " + Arrays.asList(FashionableBrand.values()));
      }
      this.id = id;
      this.name = name;
      this.yearofcreation= yearofcreation;
      this.price = price;
      this.brand = brand;
    }
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
