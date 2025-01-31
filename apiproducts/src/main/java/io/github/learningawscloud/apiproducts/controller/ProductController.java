package io.github.learningawscloud.apiproducts.controller;

import io.github.learningawscloud.apiproducts.model.Product;
import io.github.learningawscloud.apiproducts.repository.ProducRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProducRepository repository;

    public ProductController(ProducRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Produto salvo: " + product);
        repository.save(product);
        return product;
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Product product) {
        product.setId(id);
        repository.save(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

    @GetMapping("{name}")
    public List<Product> findByNameOrDescription(@RequestParam("name") String name) {
        return repository.findByName(name);
    }
}
