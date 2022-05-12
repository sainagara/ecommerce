package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ecommerce.entities.Watches;

public interface WatchesRepository extends JpaRepository<Watches, Integer> {

}
