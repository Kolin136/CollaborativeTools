package com.example.collaborativetools.user.dto;

import com.example.collaborativetools.global.annotation.Password;
import com.example.collaborativetools.global.annotation.Username;
import lombok.Getter;

@Getter
public class SignupRequestDto {
    @Username
    private String username;
    @Password
    private String password;
    private String confirmPassword;
}