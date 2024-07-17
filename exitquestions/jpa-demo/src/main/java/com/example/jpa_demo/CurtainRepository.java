package com.example.jpa_demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CurtainRepository extends CrudRepository<Curtain, Integer> {
    
    @Query("SELECT c FROM Curtain c WHERE c.price > :price")
    List<Curtain> findByPriceGreaterThan(@Param("price") int price);

    @Query("SELECT c FROM Curtain c WHERE c.brand = :brand")
    List<Curtain> findByBrand(@Param("brand") String brand);
}