package ma.mundiapolis.mundiapolisspringmvc.repository;

import ma.mundiapolis.mundiapolisspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String kw);
}