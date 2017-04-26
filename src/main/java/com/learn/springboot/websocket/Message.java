package com.learn.springboot.websocket;

/**
 * Created by liutao on 17/4/26.
 * 
 */
public class Message {
	@Override
	public String toString() {
		return "Message [name=" + name + "]";
	}

	private String name;

	public String getName() {
		return name;
	}
}