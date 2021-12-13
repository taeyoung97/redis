package com.example.demo.repository;


import java.util.Map;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;



public interface UserRepository  {

    void save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);

}