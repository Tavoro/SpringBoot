package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author Filatov
 * Контроллер Post,Put,Get,Del
 */

@RestController
@RequestMapping("/find")
public class UsersController2 {






    @GetMapping
    public String allUsers() {
//
        return "find";
    }




}   