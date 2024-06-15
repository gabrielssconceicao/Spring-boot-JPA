package com.educandoweb.springBootJPA.repositories;


import com.educandoweb.springBootJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
