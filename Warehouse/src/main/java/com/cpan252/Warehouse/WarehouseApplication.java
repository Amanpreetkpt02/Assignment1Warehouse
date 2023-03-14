package com.cpan252.Warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cpan252.Warehouse.model.Item;


import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData(WarehouseApplication repository) {
	  return args -> {
		Item c1 = Item.createClothing("Stone", 2022, 10.0, Item.FashionableBrand.STONE);
		Item c2 = Item.createClothing("Island", 2021, 5.0, Item.FashionableBrand.ISLAND);
		repository.save(c1);
		repository.save(c2);
	  };
	}
  
}
