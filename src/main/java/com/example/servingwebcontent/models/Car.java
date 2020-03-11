package com.example.servingwebcontent.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity

@Table(name = "a_car")

public class Car implements Comparable<Car> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "marka")
    private String marka;

    @Column(name = "nomer")
    private Integer nomer;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cars")
    private List<User> users = new ArrayList<>();


    @Override
    public int compareTo(Car car) {
        return this.getNomer() - car.getNomer();
    }
}
