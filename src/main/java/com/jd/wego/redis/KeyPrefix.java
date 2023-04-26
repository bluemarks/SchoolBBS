package com.jd.wego.redis;


public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();
}
