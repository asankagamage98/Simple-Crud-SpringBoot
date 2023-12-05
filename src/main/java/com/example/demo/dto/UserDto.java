package com.example.demo.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor //provide this anotaion from lombok
@Data  // the getters and setters  provide this anotaion from lombok
public class UserDto {
    @Id
    private int id;
    private String name;
    private String address;
}
