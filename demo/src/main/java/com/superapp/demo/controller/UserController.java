package com.superapp.demo.controller;

import com.superapp.demo.model.User;
import com.superapp.demo.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controla, recibe las órdenes del usuario y envía la lógica de negocio al service
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("create_user")
    public ResponseEntity<?> createUser(@RequestBody User user) {// en este endponint va a solicitar un
        return userService.createUser(user);
    }
    @GetMapping("get_user")
    public ResponseEntity<?> getUserByEmail(@RequestParam ("email") String email){
        return userService.getUserByEmail(email);
    }
    @PutMapping("update_user")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("delete_user")
    public ResponseEntity<String> deleteUser(@RequestParam ("id") Integer id){
        return userService.deleteUser(id);
    }
}
