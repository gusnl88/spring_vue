package com.project.app.dao;

import com.project.app.dto.UserDto;

import java.util.List;

import com.project.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImp implements UserDao {
    @Autowired UserMapper userMapper;

    @Override
    public List<UserDto> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<UserDto> findByDelAll() {
        return userMapper.findByDelAll();
    }

    @Override
    public int editById(UserDto uDto) {
        return userMapper.editById(uDto);
    }

    @Override
    public int delete(int no) {
        return userMapper.delete(no);
    }

    @Override
    public int deleteBye(int no) {
        return userMapper.deleteBye(no);
    }

    @Override
    public int save(UserDto uDto) {
        return userMapper.save(uDto);
    }
}
