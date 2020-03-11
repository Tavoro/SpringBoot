package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.services.implem.UserInterface;
import com.example.servingwebcontent.models.User;
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
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserInterface userInterface;


    @DeleteMapping
    public  ResponseEntity delUser(@RequestParam  (name = "id") Integer id){
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

    @RequestMapping(value = {"/", "/helloworld**"}, method = {RequestMethod.GET})

    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Tutorial");
        model.addObject("message", "Welcome Page !");
        model.setViewName("helloworld");
        return model;
    }

    @RequestMapping(value = "/protected**", method = RequestMethod.GET)
    public ModelAndView protectedPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.4 Hello World Tutorial");
        model.addObject("message", "This is protected page - Only for Admin Users!");
        model.setViewName("protected");
        return model;

    }

    @RequestMapping(value = "/confidential**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security 3.2.4 Hello World Tutorial");
        model.addObject("message", "This is confidential page - Need Super Admin Role!");
        model.setViewName("protected");

        return model;

    }


}   