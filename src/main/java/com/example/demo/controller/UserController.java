package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/getUser")
    public List<UserDto> getUser(){
        return userService.getAllUsers();
    }


    @PostMapping("/saveUser")
    public  UserDto saveUser(@RequestBody UserDto userDto){
       return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public UserDto userUpdate(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDto userDto){
        return userService.deleteUser(userDto);
    }

    @GetMapping("/getUserById/{userID}")
    public UserDto  getUserByUserId(@PathVariable String userID){
        return userService.getUserByUserId(userID);
    }

    @GetMapping("/getByUserFromIDAndAdd/{userID}/{address}")
    public UserDto getByUserFromUserIDAndAdd(@PathVariable String userID,@PathVariable String address){
        return userService.getUserFromUserIDAndAdd(userID,address);
    }
}






