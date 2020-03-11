package com.example.servingwebcontent.repositorys;

import com.example.servingwebcontent.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {


    @Query(value = "SELECT * FROM a_user where name = :name", nativeQuery = true)
    List<User> findByName(String name);

    @Modifying
    @Query(value = "INSERT INTO a_user (name, pass, id) VALUES ('Вася', '23', 7)",nativeQuery = true)
    List<User> findAllActiveUsersNative();

    @Modifying
    @Query(value = "INSERT INTO a_user (name, pass, id) VALUES ('Вася', '23', 7)",nativeQuery = true)
    void vstavka();

}

