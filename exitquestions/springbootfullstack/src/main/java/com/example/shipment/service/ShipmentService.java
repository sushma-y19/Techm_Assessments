package com.example.shipment.service;

import java.util.Optional;

import com.example.shipment.entity.Shipment;

public interface ShipmentService {
    Optional<Shipment> getShipmentByTrackNo(String trackNo);
    String deleteShipmentById(Integer shipId);
}
