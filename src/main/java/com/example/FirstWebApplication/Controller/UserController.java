package com.example.FirstWebApplication.Controller;

import com.example.FirstWebApplication.Entity.Users;
import com.example.FirstWebApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UserController {

    private final UserService usersService;

    @Autowired
    public UserController(UserService usersService) {
        this.usersService = usersService;
    }
    @RequestMapping("/users")
    // Отримати список всіх користувачів
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = usersService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    // Отримати користувача за ID
    @GetMapping("/user{id}")
    public ResponseEntity<Users> getUserById(@PathVariable int id) {
        Optional<Users> user = usersService.findUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Отримати користувача за email
    @GetMapping("/UserEmail/{email}")
    public ResponseEntity<Users> getUserByEmail(@PathVariable String email) {
        Optional<Users> user = usersService.findUserByEmail(email);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/user/barcode/{barcode}")
    public ResponseEntity<Users> getUserByBarcode(@PathVariable String barcode) {
        Optional<Users> user = usersService.findByBarcode(barcode);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Отримати користувача за username
    @GetMapping("/firstname/{firstname}")
    public ResponseEntity<Users> getUserByFirstname(@PathVariable String firstname) {
        Optional<Users> user = usersService.findUserByFirstName(firstname);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Створити нового користувача
    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        Users newUser = usersService.saveUser(user);
        return ResponseEntity.ok(newUser);
    }

    // Оновити користувача
    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable int id, @RequestBody Users userDetails) {
        Optional<Users> existingUser = usersService.findUserById(id);
        if (existingUser.isPresent()) {
            Users user = existingUser.get();
            user.setFirstname(userDetails.getFirstname());
            user.setLastname(userDetails.getLastname());
            user.setEmail(userDetails.getEmail());
            user.setBio(userDetails.getBio());
            user.setRole(userDetails.getRole());
            user.setPassword(userDetails.getPassword());
            user.setAvatar(userDetails.getAvatar());
            user.setBarcode(userDetails.getBarcode());
            Users updatedUser = usersService.saveUser(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Видалити користувача за ID
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        Optional<Users> user = usersService.findUserById(id);
        if (user.isPresent()) {
            usersService.deleteUserById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
