package com.cpan252.Warehouse.model;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity // annotate this class as a JPA entity
@Table(name = "clothing") // specify the table name for this entity

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String name;
    @Column(name = "name")
    private int yearofcreation;
    @Column(name = "year_produced")
  
    private double price;
    @Column(name = "price")
    @Enumerated(EnumType.STRING) // specify that this field should be stored as a string in the database
    @Column(name = "brand")
    private FashionableBrand brand;
    
    public static Item createClothing(String name, int yearofcreation, double price, FashionableBrand brand) {
        return Item.builder()
          .name(name)
          .yearofcreation(yearofcreation)
          .price(price)
          .brand(brand)
          .build();
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
