package com.binshow.controller;


import com.binshow.mapper.UserMapper;
import com.binshow.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api("用户管理接口")
@RestController
public class UserController {


    @Autowired
    private UserMapper userMapper;


    @ApiOperation("新增用户")
    @PostMapping("/add")
    public void save(User user){
        userMapper.insert(user);
        System.out.println("增加 user " + user.toString());
    }


    @ApiOperation("根据ID查询用户")
    @GetMapping("/getUser/{id}")
    public User getById(@PathVariable(value = "id", required = true) Long id){
        System.out.println("receive req id = " + id);
        return userMapper.getOne(id);
    }



    @ApiOperation("根据ID删除用户")
    @GetMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }

}
