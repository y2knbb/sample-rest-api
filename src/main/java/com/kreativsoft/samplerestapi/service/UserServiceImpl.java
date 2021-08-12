package com.kreativsoft.samplerestapi.service;

import com.kreativsoft.samplerestapi.entity.User;
import com.kreativsoft.samplerestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;


    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }
}
