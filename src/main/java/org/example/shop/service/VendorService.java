package org.example.shop.service;

import lombok.RequiredArgsConstructor;
import org.example.shop.dto.UserDto;
import org.example.shop.exception.UserAlreadyExist;
import org.example.shop.mapper.VendorMapper;
import org.example.shop.model.VendorEntity;
import org.example.shop.model.Role;
import org.example.shop.model.UserEntity;
import org.example.shop.repo.VendorRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VendorService extends UserEntity {
    private final VendorRepo vendorRepo;
    private final VendorMapper vendorMapper;
    private final PasswordEncoder passwordEncoder;

    public UserDto saveVendor(UserDto userDto) {
        if(!vendorRepo.existsByEmail(userDto.getEmail())) {
            VendorEntity user = vendorMapper.toEntity(userDto);
            user.setRole(Role.ROLE_VENDOR);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return vendorMapper.toDto(vendorRepo.save(user));
        }
        throw new UserAlreadyExist("email already exist");
    }
}
