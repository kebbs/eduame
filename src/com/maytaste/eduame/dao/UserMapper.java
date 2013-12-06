package com.maytaste.eduame.dao;

import java.util.Map;

import org.apache.ibatis.type.MappedTypes;


public interface UserMapper {
	
	int test();

	void changeUserHp(Map<Object, Object> par);
}
