package com.meawallet.dealership.core.ports.out.car;

import com.meawallet.dealership.domain.Car;

public interface SaveCarPort {

    Car save(Car car);
}
