package com.dataedge.springprofiledemo.service;

import com.dataedge.springprofiledemo.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getUsers();
}
