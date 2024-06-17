package com.educandoweb.springBootJPA.repositories;


import com.educandoweb.springBootJPA.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
