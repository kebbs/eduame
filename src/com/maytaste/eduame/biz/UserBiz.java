package com.maytaste.eduame.biz;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.maytaste.eduame.dao.UserMapper;

@Component("userBizBean")
@Scope("prototype")
public class UserBiz extends Biz {

	@Autowired
	private UserMapper dao;

	public UserMapper getDao() {
		return dao;
	}

	public void setDao(UserMapper dao) {
		this.dao = dao;
	}

	/**
	 * ≤‚ ‘”√
	 */
	public void changeUserHp() {
		Map<Object, Object> par=new HashMap<Object, Object>();
		par.put("name", "isunnyapp");
		dao.changeUserHp(par);
	}
	
}
