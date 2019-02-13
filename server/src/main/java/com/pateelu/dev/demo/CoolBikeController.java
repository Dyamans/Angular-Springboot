/**
 * 
 */
package com.pateelu.dev.demo;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dgpats
 *
 */

@RestController
public class CoolBikeController {
	
	private BikeRepository repository;

    public CoolBikeController(BikeRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/cool-bikes")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Bike> coolBikes() {
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Bike bike) {
        return !bike.getName().equals("AMC Gremlin") &&
                !bike.getName().equals("Triumph Stag") &&
                !bike.getName().equals("Ford Pinto") &&
                !bike.getName().equals("Yugo GV");
    }
}
