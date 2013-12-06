package com.maytaste.eduame.filter;

import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.maytaste.eduame.services.Service;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

@Component
public class JerseyContainerRequestFilter extends Service implements ContainerRequestFilter {

	
	
	@Context
	private HttpServletRequest hsreq;

	public HttpServletRequest getHsreq() {
		return hsreq;
	}
	public void setHsreq(HttpServletRequest hsreq) {
		this.hsreq = hsreq;
	}
	@Override
	public ContainerRequest filter(ContainerRequest req) {

		return req;
		
//		Message msg=new Message(false,"请先登录(可能您的会话超时了)");
//		msg.setCode(-1024);
//		throw new WebApplicationException(Response.ok(msg,MediaType.APPLICATION_JSON).build());
	}

}
