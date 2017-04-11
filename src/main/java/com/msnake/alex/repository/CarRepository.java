package com.msnake.alex.repository;

import com.msnake.alex.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для работы с машинами
 *
 * @author shigaevak
 * @since 11.04.2017
 */
public interface CarRepository extends CrudRepository<Car, Integer> {
}
