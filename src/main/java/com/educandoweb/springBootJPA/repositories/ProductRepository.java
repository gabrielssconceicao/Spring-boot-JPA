package com.educandoweb.springBootJPA.repositories;

import com.educandoweb.springBootJPA.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}