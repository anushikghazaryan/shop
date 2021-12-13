package org.example.shop.service;

import lombok.RequiredArgsConstructor;
import org.example.shop.exception.UserAlreadyExist;
import org.example.shop.model.UserEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.example.shop.mapper.CustomerMapper;
import org.example.shop.repo.CustomerRepo;
import org.example.shop.dto.UserDto;
import org.example.shop.model.Role;
import org.example.shop.model.CustomerEntity;

import java.util.List;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CustomerService extends UserEntity {
    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;
    private final PasswordEncoder passwordEncoder;

    public UserDto saveCustomer(UserDto userDto) {
        if(!customerRepo.existsByEmail(userDto.getEmail())) {
            CustomerEntity user = customerMapper.toEntity(userDto);
            user.setRole(Role.ROLE_CUSTOMER);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return customerMapper.toDto(customerRepo.save(user));
        }
        throw new UserAlreadyExist("email already exist"); // TODO
    }
}
