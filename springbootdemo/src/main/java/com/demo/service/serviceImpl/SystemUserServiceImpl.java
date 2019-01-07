package com.demo.service.serviceImpl;

import com.demo.dao.SystemUserDao;
import com.demo.entity.SystemUser;
import com.demo.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by syp on 2019/1/4.
 */
@Service
public class SystemUserServiceImpl implements SystemUserService{

    @Autowired
    private SystemUserDao systemUserDao;


    public int save(SystemUser systemUser){
       int i =  systemUserDao.insert(systemUser);
        return i;
    }

    public List<SystemUser> findList(){
        //return null;
        return systemUserDao.findList();
    }
}
