package com.example.demo.service1;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User(1,"tra","242021"));
        users.add(new User(2,"tra1","242021433"));
    }
    @Override
    public List<User> getListUser() {
        return users;
    }

    @Override
    public User getListUserById(int id) {
        for (User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User deleteListUsers(int id) {
        for (User user:users){
            if(user.getId() == id){
                users.remove(user);
            }
        }
        return null;
    }

    @Override
    public User postUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User putListUsers(User user) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == user.getId()){
                users.set(i,user);
                break;
            }
        }
        return user;
    }
}
