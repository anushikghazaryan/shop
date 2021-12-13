package org.example.shop.mapper;

import org.mapstruct.Mapper;
import org.example.shop.dto.UserDto;
import org.example.shop.model.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity toEntity(UserDto userDto);
    UserDto toDto(CustomerEntity userEntity);
}
