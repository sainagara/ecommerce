package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ecommerce.entities.Laptops;

public interface LaptopsRepository extends JpaRepository<Laptops, Integer> {

}
