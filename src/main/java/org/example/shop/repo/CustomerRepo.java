package org.example.shop.repo;

import java.util.List;

import org.example.shop.model.Role;
import org.example.shop.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findAllByRole(Role role);

    boolean existsByEmail(String email);
}
