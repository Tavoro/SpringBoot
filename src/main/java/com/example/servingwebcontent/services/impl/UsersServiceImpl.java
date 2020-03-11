package com.example.servingwebcontent.services.impl;

import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.repositorys.UsersRepository;
import com.example.servingwebcontent.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public User postUser(User user) {
        return usersRepository.save(user);
    }

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public ResponseEntity<Object> delUser(Integer Id) {
        usersRepository.deleteById(Id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //

    ///////////////////////////////////////////////////////////////////////////
    @Override
    public User editUser(User user) {
        return usersRepository.save(user);
    }

    ///////////////////////////////////////////////////////////////////////////
    @Override
    public ResponseEntity getUsers(Integer id) {
        ResponseEntity result;
        if (id == null) {
            result = ResponseEntity.ok(usersRepository.findAll());
        } else {
            result = ResponseEntity.ok(usersRepository.findById(id).get());

        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    @Override
    public List<User> getUsers2() {
        List<User> result = new ArrayList<>();
        usersRepository.findAll().forEach(result::add);
        return result;
    }

    /////////////////////////////////////////////////////////////////////////////
    @Override
    public List<User> findByName(String s) {
        return usersRepository.findByName(s);
    }

    @Override
    public List<User> qwer() {

        return usersRepository.findAllActiveUsersNative();
    }

    @Override
    public void vstavka() {
        usersRepository.vstavka();
    }

}







