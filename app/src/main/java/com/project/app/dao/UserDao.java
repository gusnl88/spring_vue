package com.project.app.dao;

import com.project.app.dto.UserDto;

import java.util.List;

public interface UserDao {
    public List<UserDto> findAll();
    public List<UserDto> findByDelAll();
    public int editById(UserDto uDto);
    public int delete(int no);
    public int deleteBye(int no);
    public int save(UserDto uDto);

}
