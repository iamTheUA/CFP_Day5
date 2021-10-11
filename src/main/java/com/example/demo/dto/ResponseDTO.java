package com.example.demo.dto;

import com.example.demo.entity.Employee;

public class ResponseDTO {
	
	private String message;
	private Object data;
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
	public ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	

	
	
	
}