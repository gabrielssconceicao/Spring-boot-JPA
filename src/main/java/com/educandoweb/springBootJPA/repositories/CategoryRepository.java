package com.educandoweb.springBootJPA.repositories;

import com.educandoweb.springBootJPA.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}