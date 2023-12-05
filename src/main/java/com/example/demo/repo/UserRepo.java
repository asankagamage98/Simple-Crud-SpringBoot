package com.example.demo.repo;

import com.example.demo.entity.User; //import user entity
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value ="SELECT * FROM USER WHERE ID =?1",nativeQuery = true) //wright quary for find  value from id
    User getUserById(String userId);




    //@Modifying //this is used for native update quary
}
