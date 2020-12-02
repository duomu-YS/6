package com.duomu.mycat.springboot.service;

import com.duomu.mycat.springboot.mapper.UserMapper;
import com.duomu.mycat.springboot.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServer {

    @Resource
    private UserMapper userMapper;

    public User selectById(Integer id){
        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }

    public Integer add(User user){
       Integer result =  userMapper.insert(user);

       return result;
    }

    public List<User> selectAll(){
       List<User>  list=  userMapper.selectAll();
        return list;
    }


}
