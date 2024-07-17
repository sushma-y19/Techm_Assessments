package com.example.shipment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shipment.entity.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer>{
	Optional<Shipment> findByTrackNo(String trackNo);
}
