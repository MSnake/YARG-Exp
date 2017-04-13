package com.msnake.alex.controller;

import com.msnake.alex.model.Car;
import com.msnake.alex.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для машин
 *
 * @author shigaevak
 * @since 11.04.2017
 */
@RequestMapping(path = "v1/car/", produces = "application/json; charset=utf-8")
@RestController
@CrossOrigin
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping
    public ResponseEntity getCars() {
        try {
            List<Car> cars = carService.get();
            return new ResponseEntity(cars, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
