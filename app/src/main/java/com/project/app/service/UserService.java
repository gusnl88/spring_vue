package com.project.app.service;

import com.project.app.dto.ResultDto;
import com.project.app.dto.UserDto;

public interface UserService {
    public ResultDto findAll();
    public ResultDto findByDelAll();
    public ResultDto editById(UserDto uDto);
    public ResultDto delete(int no);
    public ResultDto deleteBye(int no);
    public ResultDto sava(UserDto uDto);
}
