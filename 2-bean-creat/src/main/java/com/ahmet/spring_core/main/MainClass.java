package com.ahmet.spring_core.main;

import java.util.ArrayList;
import java.util.List;

import com.ahmet.spring_core.model.User;
import com.ahmet.spring_core.services.UserService;

public class MainClass {
    public static void main(String[] args) {
        UserService userService1 = new UserService();

        List<User> userList=new ArrayList<>();

        userList.add(new User("Ahmet"));
        userList.add(new User("Mehmet"));
        userList.add(new User("Ayse")); 
        userService1.setUsers(userList);

        UserService userService2 = new UserService();
        userService2.setUsers(userList);
      System.out.println("UserService1 Users:");
     
    }
}
