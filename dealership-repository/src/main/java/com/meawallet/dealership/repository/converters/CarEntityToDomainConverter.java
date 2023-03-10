package com.meawallet.dealership.repository.converters;

import com.meawallet.dealership.repository.entity.CarEntity;
import com.meawallet.dealership.domain.Car;
import org.springframework.stereotype.Component;

@Component
public class CarEntityToDomainConverter {

    public Car convert(CarEntity entity) {
        return Car.builder()
                .model(entity.getModel())
                .brand(entity.getBrand())
                .year(entity.getCarYear())
                .engineType(entity.getEngineType())
                .engineVolume(entity.getEngineVolume())
                .horsePower(entity.getHorsePower())
                .drivenKm(entity.getDrivenKm())
                .numberPlate(entity.getNumberPlate())
                .id(entity.getCarId())
                .build();
    }
}
