package com.meawallet.dealership.repository.Adapters.DealershipAdapter;

import com.meawallet.dealership.core.ports.out.dealership.SaveDealershipPort;
import com.meawallet.dealership.domain.CarDealership;
import com.meawallet.dealership.repository.converters.CarDealershipDomainToEntityConverter;
import com.meawallet.dealership.repository.converters.CarDealershipEntityToDomainConverter;
import com.meawallet.dealership.repository.repository.dealershipRepository.DealershipRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Transactional
@AllArgsConstructor
public class SaveDealershipAdapter implements SaveDealershipPort {

    private final DealershipRepository dealershipRepository;
    private final CarDealershipDomainToEntityConverter carDealershipDomainToEntityConverter;
    private final CarDealershipEntityToDomainConverter carDealershipEntityToDomainConverter;

    @Override
    public CarDealership save(CarDealership dealership) {
        var entity = carDealershipDomainToEntityConverter.convert(dealership);
        dealershipRepository.save(entity);
        return carDealershipEntityToDomainConverter.convert(entity);

    }
}
