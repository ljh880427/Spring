package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.java.dto.User;

@Mapper
public interface UserMapper {

	@Select("select * from users where 삭제여부 = 0")
	public List<User> findAll();
	
}
