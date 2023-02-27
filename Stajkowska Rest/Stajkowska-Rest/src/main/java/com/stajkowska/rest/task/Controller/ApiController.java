package com.stajkowska.rest.task.Controller;

import com.stajkowska.rest.task.model.User;
import com.stajkowska.rest.task.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {
    private final UserRepository userRepository;

    public ApiController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/Users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/Users/{id}")
    public ResponseEntity<User> getUserById(Long UserId) {
        Optional<User> user = userRepository.findById(UserId);
        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/Users")
    public User createUser( User user) {
        return userRepository.save(user);
    }

    @PutMapping("/Users/{id}")
    public ResponseEntity<User> updateUser(Long UserId,User UserDetails) {
        Optional<User> user = userRepository.findById(UserId);
        if(user.isPresent()) {
            User existingUser = user.get();
            existingUser.setFirstName(UserDetails.getFirstName());
            existingUser.setLastName(UserDetails.getLastName());
            existingUser.setDepartment(UserDetails.getDepartment());
            final User updatedUser = userRepository.save(existingUser);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/Users/{id}")
    public ResponseEntity<Void> deleteUser(Long UserId) {
        Optional<User> user = userRepository.findById(UserId);
        if(user.isPresent()) {
            userRepository.delete(user.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}