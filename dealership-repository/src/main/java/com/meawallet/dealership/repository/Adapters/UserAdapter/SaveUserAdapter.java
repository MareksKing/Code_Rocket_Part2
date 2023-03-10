package com.meawallet.dealership.repository.Adapters.UserAdapter;

import com.meawallet.dealership.core.ports.out.user.SaveUserPort;
import com.meawallet.dealership.domain.User;
import com.meawallet.dealership.repository.converters.UserDomainToEntityConverter;
import com.meawallet.dealership.repository.converters.UserEntityToDomainConverter;
import com.meawallet.dealership.repository.repository.userRepository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Transactional
@AllArgsConstructor
public class SaveUserAdapter implements SaveUserPort {

    private final UserRepository userRepository;
    private final UserDomainToEntityConverter userDomainToEntityConverter;
    private final UserEntityToDomainConverter userEntityToDomainConverter;
    @Override
    public User save(User user) {
        var entity = userDomainToEntityConverter.convert(user);
        userRepository.save(entity);
        return userEntityToDomainConverter.convert(entity);
    }
}
