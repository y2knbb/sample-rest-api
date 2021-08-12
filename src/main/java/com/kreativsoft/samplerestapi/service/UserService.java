package com.kreativsoft.samplerestapi.service;

import com.kreativsoft.samplerestapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
}
