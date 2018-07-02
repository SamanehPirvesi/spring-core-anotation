package com.model;

import org.springframework.stereotype.Component;

@Component
public class SpringTest {
	private String msg;

	public SpringTest() {
      msg="test anno";
	}

	public SpringTest(String msg) {

		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void printYourMessage() {
		System.out.println(msg);
	}

}
