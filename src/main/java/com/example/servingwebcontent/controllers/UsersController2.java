package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.services.implem.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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