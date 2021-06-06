package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service1.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getListUsers(){
        List<User> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getListUsersById(@PathVariable int id){
        User resUser = userService.getListUserById(id);
        return ResponseEntity.ok(resUser);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteListUsers(@PathVariable int id){
        User resUser = userService.deleteListUsers(id);
        return ResponseEntity.ok(resUser);
    }
    @PostMapping ("")
    public ResponseEntity<?> postListUsers(@RequestBody User user){
        User resUser = userService.postUser(user);
        return ResponseEntity.ok(resUser);
    }
    @PutMapping ("")
    public ResponseEntity<?> putListUsers(@RequestBody User user){
        User resUser = userService.putListUsers(user);
        return ResponseEntity.ok(resUser);
    }
}
