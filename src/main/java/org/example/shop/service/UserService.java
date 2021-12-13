package org.example.shop.service;

import lombok.RequiredArgsConstructor;
import org.example.shop.model.UserEntity;
import org.example.shop.repo.UserRepo;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepo userRepo;
    public UserEntity deleteUser(Integer id) {
        Optional<UserEntity> user = userRepo.findById(id);

        if(user.isPresent()) {
            userRepo.deleteById(id);
            return user.get();
        }
        throw new UsernameNotFoundException(String.format("user with %s id doesn't exist", id));
    }
}
