package com.maytaste.eduame.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.maytaste.eduame.bean.Bean;
import com.sun.jersey.api.view.Viewable;

public class Service extends Bean {

	
	protected boolean isNull(Object it){
		if (it==null)return true;//null
		if (it instanceof String && it.equals(""))return true;//空字符串
		return false;
	}
	
	protected Integer getLoginUserId(HttpServletRequest req) {
		Object id= req.getSession().getAttribute("user");
		if (id!=null) {
			return Integer.parseInt(id.toString());
		}
		return null;
	}
	
	protected String toJsonString(Object obj) {
		JSONSerializer s=new JSONSerializer();
		s.write(obj);
		return s.toString();
	}
	protected <T> T parseObject(String json,Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}
	
	protected <T> List<T> parseArray(String json,Class<T> clazz) {
		return JSON.parseArray(json, clazz);
	}
	
	protected Viewable viewable(String jsp,Object... args) {

		if (isNull(args) || args.length==0) {
			return new Viewable(jsp);
		}
		
		Map<Object, Object> par=new HashMap<Object, Object>();
		
		for (int i = 0; i < args.length-1; i+=2) {
			par.put(args[i], args[i+1]);
		}
		return new Viewable(jsp,par);
	}
}


