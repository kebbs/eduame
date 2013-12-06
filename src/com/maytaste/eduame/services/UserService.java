package com.maytaste.eduame.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.maytaste.eduame.biz.UserBiz;
import com.maytaste.eduame.entity.Message;

@Path("user")
@Component
@Scope("prototype")
public class UserService extends Service {
	
	@Autowired
	private UserBiz biz;

	public UserBiz getBiz() {
		return biz;
	}

	public void setBiz(UserBiz biz) {
		this.biz = biz;
	}
	
	@GET
	@Path("test")
	@Produces(MediaType.APPLICATION_JSON)
	public Message test(){
		return new Message();
	}
	
	@GET
	@Path("time")
	@Produces(MediaType.APPLICATION_JSON)
	public String time(){
		biz.changeUserHp();
		return "yes";
	}
}
