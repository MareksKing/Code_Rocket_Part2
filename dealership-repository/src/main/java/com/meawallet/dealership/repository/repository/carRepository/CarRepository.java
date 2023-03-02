package com.meawallet.dealership.repository.repository.carRepository;


import com.meawallet.dealership.domain.Car;

import java.util.Optional;

public interface CarRepository {

    void save(Car car);

    Optional<Car> findCarById(Integer id);
}