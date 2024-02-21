package com.java.hiapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.hiapp.entity.User;

public interface UserMRepository extends JpaRepository<User, Integer> {

}