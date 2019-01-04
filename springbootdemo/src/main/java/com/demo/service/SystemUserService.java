package com.demo.service;

import com.demo.entity.SystemUser;

import java.util.List;

/**
 * Created by syp on 2019/1/4.
 */
public interface SystemUserService {
    int save(SystemUser systemUser);
    List<SystemUser> findList();
}
