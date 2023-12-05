package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor //provide this anotaion from lombok
@Data  // the getters and setters  provide this anotaion from lombok
public class User {
    @Id
    private int id;
    private String name;
    private String address;

}
