package com.example.servingwebcontent.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * Модель Юзера.
 * Используется Ломбок.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode


@Entity

@Table(name = "a_user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;


    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_car",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")
    )
    private List<Car> cars = new ArrayList<>();



}
