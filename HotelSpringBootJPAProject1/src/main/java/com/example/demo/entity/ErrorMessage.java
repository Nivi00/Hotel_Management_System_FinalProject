package com.example.demo.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	private HttpStatus status;
	private String Message;
	public ErrorMessage() {
		super();
	}
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		Message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", Message=" + Message + "]";
	}
}