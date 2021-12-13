package org.example.shop.mapper;

import org.example.shop.model.VendorEntity;
import org.mapstruct.Mapper;
import org.example.shop.dto.UserDto;

@Mapper(componentModel = "spring")
public interface VendorMapper {
    VendorEntity toEntity(UserDto userDto);
    UserDto toDto(VendorEntity userEntity);
}
