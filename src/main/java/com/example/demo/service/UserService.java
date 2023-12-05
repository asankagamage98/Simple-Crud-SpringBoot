package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDto saveUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    //
    public List<UserDto> getAllUsers(){
        List<User>userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDto>>(){}.getType());
    }

    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class)); //use the same method for update save method check user id auto and update
        return userDto;
    }

    public boolean deleteUser(UserDto userDto){
        userRepo.delete(modelMapper.map(userDto, User.class));
        return true;
    }

    //data return from user id
    //select  * from user where id =1
    public UserDto getUserByUserId(String userId){
        User user = userRepo.getUserById(userId);
        return modelMapper.map(user,UserDto.class);

    }

    public UserDto getUserFromUserIDAndAdd(String userID , String address){
        User user = userRepo.getUserFromUserIDAnsAdd(userID,address);
        return modelMapper.map(user,UserDto.class);
    }
}
