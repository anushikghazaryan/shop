package org.example.shop.auth;

import org.example.shop.model.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class UserEntityUserDetailsMapper {
    public MyUserDetails map(UserEntity user) {
        HashSet<GrantedAuthority> role = new HashSet<>();
        role.add(new SimpleGrantedAuthority(user.getRole().toString()));
        return new MyUserDetails(user.getUsername(), user.getPassword(), role);
    }
}
