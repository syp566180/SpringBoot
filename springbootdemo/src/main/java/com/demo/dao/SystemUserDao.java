package com.demo.dao;

import com.demo.entity.SystemUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by syp on 2019/1/4.
 */

@Mapper
@Repository
public interface SystemUserDao {

    /**
     * 插入返回
     * @param systemUser
     * @return
     */
    @Insert("INSERT INTO SPBT_SYSTEM_USER(ID, USER, PWD) values (#{id}, #{user}, #{pwd})")
    int insert(SystemUser systemUser);


    @Select("SELECT * FROM SPBT_SYSTEM_USER")
    List<SystemUser> findList();
}
