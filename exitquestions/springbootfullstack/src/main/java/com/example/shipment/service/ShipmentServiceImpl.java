package com.example.shipment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shipment.entity.Shipment;
import com.example.shipment.repository.ShipmentRepository;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public Optional<Shipment> getShipmentByTrackNo(String trackNo) {
        return shipmentRepository.findByTrackNo(trackNo);
    }

    @Override
    public String deleteShipmentById(Integer shipId) {
        Optional<Shipment> shipment = shipmentRepository.findById(shipId);
        if (shipment.isPresent()) {
            shipmentRepository.deleteById(shipId);
            return "The requested shipId-" + shipId + " got deleted";
        }
        return "Shipment with the specified shipId not found";
    }
}
