package org.example.shop.controller;

import lombok.RequiredArgsConstructor;
import org.example.shop.dto.UserDto;
import org.example.shop.service.VendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
@RequiredArgsConstructor
public class VendorController {
    private final VendorService vendorService;

    @GetMapping("/register")
    public String registerVendor() {
        return "register vendor";
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerVendor(@RequestBody UserDto user) {
        return new ResponseEntity<>(vendorService.saveVendor(user), HttpStatus.CREATED);
    }


}
