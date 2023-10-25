package com.project.app.controller;

import com.project.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.dto.ResultDto;
import com.project.app.service.UserService;

@CrossOrigin(origins = "http://localhost:8800")
@RestController
public class DataController {


    @GetMapping("/")
    public String home(){
        return "Data 준비중";
    }

    @GetMapping("/api")
    public String api(){
        return "Api Data 준비중";
    }

    @Autowired UserService userService;

    @PostMapping("/findAll")
    public ResultDto findAll(){
        return userService.findAll();
    }

    @PostMapping("/editById")
    public ResultDto editById(@RequestBody UserDto uDto){
        System.out.println(uDto);
        return userService.editById(uDto);
    }
    @DeleteMapping("/delete")
    public ResultDto delete(@RequestParam("no") int no){
        return userService.delete(no);
    }
    @DeleteMapping("/deleteBye")
    public ResultDto deleteBye(@RequestParam("no") int no){
        System.out.println(no);
        return userService.deleteBye(no);
    }
    @PutMapping("/save")
    public ResultDto save(@RequestBody UserDto uDto){
        return userService.sava(uDto);
    }
    @PostMapping("/findByDelALL")
    public ResultDto findByDelAll(){
        return userService.findByDelAll();
    }
}
