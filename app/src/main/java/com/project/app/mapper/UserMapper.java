package com.project.app.mapper;

import com.project.app.dto.UserDto;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user3 where del=0")
    public List<UserDto> findAll();
    @Select("select * from user3 where del=1")
    public List<UserDto> findByDelAll();

    @Update("update user3 set name = #{name}, pwd = #{pwd}, gender = #{gender} where no = #{no}")

    public int editById(UserDto uDto);
    @Update("update user3 set del = true where no = #{no}")
    
    public int delete(int no);
    @Delete("delete from user3 where no=#{no}")
    public int deleteBye(int no);
    @Insert("insert into user3 (name,email,pwd,gender) value (#{name},#{email},#{pwd},#{gender})")
    public int save(UserDto uDto);
}
