package com.vsk.ExceptionHandling.repositories;


import com.vsk.ExceptionHandling.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
