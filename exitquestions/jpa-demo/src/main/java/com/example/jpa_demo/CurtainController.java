package com.example.jpa_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurtainController {

    @Autowired
    private CurtainRepository curtainRepository;

    @GetMapping("/curtains/price")
    public List<Curtain> getCurtainsByPrice(@RequestParam int price) {
        return curtainRepository.findByPriceGreaterThan(price);
    }

    @GetMapping("/curtains/brand")
    public List<Curtain> getCurtainsByBrand(@RequestParam String brand) {
        return curtainRepository.findByBrand(brand);
    }
}