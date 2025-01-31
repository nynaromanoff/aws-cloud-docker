package io.github.learningawscloud.apiproducts.repository;

import io.github.learningawscloud.apiproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProducRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
}
