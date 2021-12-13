package org.example.shop.controller;

import lombok.RequiredArgsConstructor;
import org.example.shop.dto.UserDto;
import org.example.shop.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/register")
    public String registerCustomer() {
        return "register customer";
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> registerCustomer(@RequestBody UserDto userDto) {
        return new ResponseEntity<UserDto>(customerService.saveCustomer(userDto), HttpStatus.CREATED);
    }
}
