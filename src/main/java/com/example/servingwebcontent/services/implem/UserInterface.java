package com.example.servingwebcontent.services.implem;

import com.example.servingwebcontent.models.User;
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
