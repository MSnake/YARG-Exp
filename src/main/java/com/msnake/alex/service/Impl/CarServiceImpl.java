package com.msnake.alex.service.Impl;

import com.msnake.alex.model.Car;
import com.msnake.alex.repository.CarRepository;
import com.msnake.alex.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Реализация сервиса для работы с машинами
 *
 * @author shigaevak
 * @since 13.04.2017
 */
@Service
@Transactional
public class CarServiceImpl implements CarService{

    /**
     * DAO для работы с машинами
     */
    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> get() throws Exception {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car get(Integer id) throws Exception {
        return carRepository.findOne(id);
    }

    @Override
    public Car create(Car entity) throws Exception {
        return carRepository.save(entity);
    }

    @Override
    public Car update(Car entity) throws Exception {
        return carRepository.save(entity);
    }

    @Override
    public void remove(Car entity) throws Exception {
        carRepository.save(entity);
    }
}
