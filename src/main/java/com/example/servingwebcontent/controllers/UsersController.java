package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.services.UserInterface;
import com.example.servingwebcontent.models.User;
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
    private UserInterface userInterface;


    @DeleteMapping
    public  ResponseEntity<Object> delUser(@RequestParam  (name = "id") Integer id){
        return userInterface.delUser(id);
    }


    @PostMapping
    public User postUser(User user) {
        return userInterface.postUser(user);
    }

    @GetMapping
    public ResponseEntity allUsers(@RequestParam(name = "id", required = false) Integer id) {
//        System.out.println(usersService.getUsers2().get(0).getCars().get(0).getMarka()); //Выводим первую марку юзера
        return userInterface.getUsers(id);}

    @GetMapping("/find")
    public List<User> findByName(@RequestParam(name = "name", required = false) String name){
        return userInterface.findByName(name);
    }
    @PutMapping
    public User editUser(User user) { return userInterface.editUser(user); }



}   