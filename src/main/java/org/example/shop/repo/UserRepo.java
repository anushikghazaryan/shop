package org.example.shop.repo;

import org.example.shop.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
    UserEntity removeById(Integer id);
    boolean existsByEmail(String email);
}
