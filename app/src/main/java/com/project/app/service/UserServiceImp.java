package com.project.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.dao.UserDao;
import com.project.app.dto.ResultDto;
import com.project.app.dto.UserDto;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private ResultDto rDto;

    @Autowired UserDao uDao;
    
    @Override
    public ResultDto findAll() {
        rDto = new ResultDto();
        List<UserDto> resultList= uDao.findAll();
        if(resultList != null){
            rDto.setState(true);
            rDto.setResult(resultList);
        }else{
            rDto.setState(false);
        }
        return rDto;
    }

    @Override
    public ResultDto findByDelAll() {
        rDto = new ResultDto();
        List<UserDto> resultList= uDao.findByDelAll();
        if(resultList != null){
            rDto.setState(true);
            rDto.setResult(resultList);
        }else{
            rDto.setState(false);
        }
        return rDto;
    }

    @Override
    public ResultDto editById(UserDto uDto) {
        rDto = new ResultDto();
        int state = uDao.editById(uDto);
        System.out.println(state);
        if(state == 1){
            rDto.setState(true);
            rDto.setMessage("사용자 수정이 성공 하였습니다.");
        }else{
            rDto.setState(false);
            rDto.setMessage("사용자 수정이 실패 하였습니다.");
        }
        return rDto;
    }

    @Override
    public ResultDto delete(int no) {
        rDto = new ResultDto();
        int state = uDao.delete(no);
        if(state ==1){
            rDto.setState(true);
            rDto.setMessage("사용자 삭제가 성공 하였습니다");
        }else{
             rDto.setState(false);
            rDto.setMessage("사용자 삭제가 실패 하였습니다");
        }
        return rDto;
    }

    @Override
    public ResultDto deleteBye(int no) {
        rDto = new ResultDto();
        int state = uDao.deleteBye(no);
        if(state ==1){
            rDto.setState(true);
            rDto.setMessage("사용자 삭제가 성공 하였습니다");
        }else{
            rDto.setState(false);
            rDto.setMessage("사용자 삭제가 실패 하였습니다");
        }
        return rDto;
    }

    @Override
    public ResultDto sava(UserDto uDto) {
         rDto = new ResultDto();
        int state = uDao.save(uDto);
        if(state ==1){
            rDto.setState(true);
            rDto.setResult(uDto);
            rDto.setMessage("사용자 생성이 성공 하였습니다");
        }else{
             rDto.setState(false);
            rDto.setMessage("사용자 생성이 실패 하였습니다");
        }
        return rDto;
    }
}
