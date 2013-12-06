package com.maytaste.eduame.entity;

import java.util.Map;

public class Message {
	private boolean success;
	private String message;
	private Object data;
	private Object other;
	private Integer count;
	private Integer code;
	private Object extra;
	
	public Object getExtra() {
		return extra;
	}

	public void setExtra(Object extra) {
		this.extra = extra;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Message(){
		this.success=true;
	}
	
	public Message(boolean suc){
		this.success=suc;
	}
	
	public Message(boolean suc,String msg){
		this.success=suc;
		this.message=msg;
	}
	
	public Message(boolean suc,String msg,Object data){
		this.success=suc;
		this.message=msg;
		this.data=data;
	}
	
	public Message(Object data){
		this.success=true;
		this.data=data;
	}
	public Message(Object data,Integer count){
		this.success=true;
		this.data=data;
		this.count=count;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Object getOther() {
		return other;
	}

	public void setOther(Object other) {
		this.other = other;
	}
}
