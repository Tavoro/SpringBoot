package com.example.servingwebcontent.Interfase;

import com.example.servingwebcontent.Models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserInterface {

    User postUser(User user);

    ResponseEntity delUser(Integer Id);

    User editUser(User user);

    ResponseEntity getUsers(Integer id);

    List<User> getUsers2();

    List<User> findByName(String s);

}
