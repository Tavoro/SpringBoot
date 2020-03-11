package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Filatov
 * Контроллер Post,Put,Get,Del
 */

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;


    @DeleteMapping
    public ResponseEntity<Object> delUser(@RequestParam(name = "id") Integer id) {
        return userService.delUser(id);
    }


    @PostMapping
    public User postUser(User user) {
        return userService.postUser(user);
    }

    @GetMapping
    public ResponseEntity allUsers(@RequestParam(name = "id", required = false) Integer id) {
//        System.out.println(usersService.getUsers2().get(0).getCars().get(0).getMarka()); //Выводим первую марку юзера
        return userService.getUsers(id);
    }

    @GetMapping("/find")
    public List<User> findByName(@RequestParam(name = "name", required = false) String name) {
        return userService.findByName(name);
    }
    @PutMapping
    public User editUser(User user) {
        return userService.editUser(user);
    }


}   