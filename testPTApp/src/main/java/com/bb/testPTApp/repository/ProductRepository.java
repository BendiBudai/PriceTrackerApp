package com.bb.testPTApp.repository;


import com.bb.testPTApp.model.Product;
import com.google.common.base.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // SELECT * FROM product WHERE link = ?
    // @Query("SELECT s FROM product WHERE s.link = ?1")
    Optional<Product> findByLink(String link);

}
