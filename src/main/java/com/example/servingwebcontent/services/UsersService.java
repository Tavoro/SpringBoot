package com.example.servingwebcontent.services;

import com.example.servingwebcontent.services.implem.UserInterface;
import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UsersService implements UserInterface  {
    @Autowired
    private UsersRepository usersRepository;

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public User postUser(User user) {return usersRepository.save(user);}

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public ResponseEntity delUser(Integer Id){
        usersRepository.deleteById(Id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    ///////////////////////////////////////////////////////////////////////////
    @Override
    public User editUser(User user) {return usersRepository.save(user);}

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
    public List<User> findByName(String s){
        return usersRepository.findByName(s);
    }

}







