package com.example.liquebasedemo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String height;
    @Column
    private String adress;
    @Column
    private String email;

    public Person(String name, String height,String adress) {
        this.adress=adress;
        this.name = name;
        this.height = height;
    }


}
