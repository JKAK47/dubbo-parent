package org.luisyang.dubbo.api.impl;

import org.luisyang.dubbo.api.HelloService;

import com.alibaba.dubbo.rpc.RpcException;

public class HelloServiceImpl implements  HelloService{

	public void echo(String str) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Hello  " +str +"  !!!!!");
		//throw new Exception("sdf");
		throw new RpcException("中国人寿");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "dubbo provider ";
	}

}