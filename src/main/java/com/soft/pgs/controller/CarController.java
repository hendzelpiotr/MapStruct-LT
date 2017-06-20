package com.soft.pgs.controller;

import com.soft.pgs.dto.CarDTO;
import com.soft.pgs.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@RestController
@RequestMapping("api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<CarDTO>> getAll() {
        List<CarDTO> carDTOs = carService.getAllEmployees();
        return ResponseEntity.ok(carDTOs);
    }

    @GetMapping("{id}")
    public ResponseEntity<CarDTO> getOne(@PathVariable("id") Integer id) {
        CarDTO carDTO = carService.getOne(id);
        return ResponseEntity.ok(carDTO);
    }

}
