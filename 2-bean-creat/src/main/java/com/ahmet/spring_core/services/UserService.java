package com.ahmet.spring_core.services;

import java.util.List;

import com.ahmet.spring_core.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserService {
    private List<User> users;
}
