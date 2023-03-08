package com.meawallet.dealership.repository.repository.carRepository;


import com.meawallet.dealership.domain.Car;
import com.meawallet.dealership.repository.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

    Car save(Car car);

    Optional<Car> findCarById(Integer id);
}
