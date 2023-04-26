package com.jd.wego.service;

import com.jd.wego.entity.User;

import java.util.*;


public interface UserService {

    void insert(User user);

    User selectByUserId(String userId);

    void updateByUserId(User user);

    void resetAchieveValue();

    List<User> top10LeaderBoard();

}
