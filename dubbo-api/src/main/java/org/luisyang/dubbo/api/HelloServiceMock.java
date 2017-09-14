package org.luisyang.dubbo.api;

public class HelloServiceMock implements HelloService {

	public HelloServiceMock() {
		// TODO Auto-generated constructor stub
	}
	public void echo(String str) {
		// TODO Auto-generated method stub
		System.out.println("系统异常");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "系统异常,Name: null";
	}

}
