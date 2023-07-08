package com.demo.swaggercodegen.controller;

import com.demo.swagger.api.UserApi;
import com.demo.swagger.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/user")
public class userController implements UserApi {

    @Override
    public ResponseEntity<Void> createUser(@Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(@NotNull @Valid String username, @NotNull @Valid String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, @Valid User body) {
        return null;
    }
}
