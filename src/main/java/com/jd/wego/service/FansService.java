package com.jd.wego.service;

import com.jd.wego.entity.Fans;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface FansService {

    void insertFans(Fans fans);

    void deleteFans(String userId, String followId);

    List<Fans> selectAllFansByUserId(String userId);
}
