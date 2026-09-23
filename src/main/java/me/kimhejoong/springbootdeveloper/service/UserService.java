package me.kimhejoong.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kimhejoong.springbootdeveloper.domain.User;
import me.kimhejoong.springbootdeveloper.dto.AddUserRequest;
import me.kimhejoong.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}