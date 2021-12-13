package org.example.shop.repo;

import org.example.shop.model.VendorEntity;
import org.example.shop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepo extends JpaRepository<VendorEntity, Integer> {
    boolean existsByEmail(String email);

    List<VendorEntity> findAllByRole(Role role);
}
