package org.example.shop.auth;

import lombok.RequiredArgsConstructor;
import org.example.shop.model.UserEntity;
import org.example.shop.repo.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class MyUserDaoImpl implements MyUserDao{
    private final UserRepo userRepo;
    private final UserEntityUserDetailsMapper mapper;

    @Override
    public Optional<MyUserDetails> findUserByUsername(String username) {
        UserEntity user = userRepo.findByUsername(username);

        return Optional.of(mapper.map(user));
    }
}
