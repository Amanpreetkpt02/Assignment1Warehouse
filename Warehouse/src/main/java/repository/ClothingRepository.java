package repository;
import com.cpan225.Warehouse.model.Item;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// necessary imports 
import org.springframework.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public class ClothingRepository {
@Query("SELECT c FROM Clothing c WHERE c.brand = :brand AND c.yearProduced = :year")
  List<Item> findByBrandAndYear(@Param("brand") Item.FashionableBrand brand, @Param("year") int year);
}
