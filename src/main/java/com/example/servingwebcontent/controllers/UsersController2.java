package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.services.UserService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.servingwebcontent.repositorys.UsersRepository;

import java.util.Collection;
import java.util.List;


/**
 * @author Filatov
 * Контроллер Post,Put,Get,Del
 */

@RestController
@RequestMapping("/fin")


public class UsersController2 {

    @Autowired
    private UserService userService;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public List<User> get(){
      return userService.findByName("Юля");
    }


//    @GetMapping
//    public String allUsers() {
//
//
//        return "find";
//    }




}   