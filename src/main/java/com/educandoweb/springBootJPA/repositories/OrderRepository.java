package com.educandoweb.springBootJPA.repositories;

import com.educandoweb.springBootJPA.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}