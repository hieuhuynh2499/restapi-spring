package com.example.demo.service1;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();
    public User getListUserById(int id);
    public User deleteListUsers(int id);
    public User postUser(User user);
    public User putListUsers(User user);
}
