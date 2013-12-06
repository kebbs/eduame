package com.maytaste.eduame.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext cxt)
			throws BeansException {
		this.applicationContext=cxt;
	}
	
	protected Object getBeanFromSpring(String x) {
		return this.applicationContext.getBean(x);
	}
	
	protected <T> T getBeanFromSpring(String x,Class<T> t) {
		return this.applicationContext.getBean(x, t);
	}
	
	protected <T> T getBeanFromSpring(Class<T> t) {
		 return this.applicationContext.getBean(t);
	}
}
