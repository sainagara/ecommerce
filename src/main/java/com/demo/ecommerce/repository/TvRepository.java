package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ecommerce.entities.Tv;

public interface TvRepository extends JpaRepository<Tv, Integer> {

}
