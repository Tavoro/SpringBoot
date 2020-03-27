package com.example.servingwebcontent.controllers;

import org.springframework.web.bind.annotation.*;

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