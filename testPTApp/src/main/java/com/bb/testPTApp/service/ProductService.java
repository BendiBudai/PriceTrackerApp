package com.bb.testPTApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.bb.testPTApp.model.Product;
import com.bb.testPTApp.repository.ProductRepository;



@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        com.google.common.base.Optional<Product> optionalProduct = productRepository // java.util.Optional
                .findByLink(product.getLink());

        if (optionalProduct.isPresent()) {
            throw new IllegalStateException("\n link already in db");
        }
        productRepository.save(product);
    }

    public void removeProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);

        if (!exists) {
            throw new IllegalStateException("product with ID " + productId + "does not exists");
        }
        productRepository.deleteById(productId);
    }

    @Transactional // TODO so Getters/setters are used to update @Entity
    public void updateProduct(Long productId, Double price, LocalDateTime lastUpdate) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("product with ID " + productId + " does not exists"));

        if (price != null && !Objects.equals(product.getPrice(), price))

        {
            product.setPrice(price);
        }
        if (lastUpdate != null && !Objects.equals(product.getLastCheck(), lastUpdate))
        {
            product.setLastCheck(lastUpdate);
        }
    }
}
// TODO DB update product (2)
// function to iterate over all products in db 
//and selenium to open link and scrape price
//if the price != product.getPrice() 
//than product.setPrice(newPrice);
//update lastUpdate field to System.currentTimeMillis (get the time of the update)
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// TODO UI (1)
//text field: (arukereső) add link (+ADD button)
//selenium to scrape added link 
//check if valid link ?
//create product object
//add to db
//table with all tracked products (for now all products in the database) 
//delete product from table so it gets deleted in database too
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

//TODO periodic intervall DB update (3)

// átrendezni jsp-re kikommentelni ami nem kell!