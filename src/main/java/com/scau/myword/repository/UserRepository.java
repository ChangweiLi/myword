package com.scau.myword.repository;

import com.scau.myword.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{


//    List<User> findAllUsers();
}
