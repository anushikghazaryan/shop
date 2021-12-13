package org.example.shop.auth;

import java.util.Optional;

public interface MyUserDao {
    Optional<MyUserDetails> findUserByUsername(String username);
}
