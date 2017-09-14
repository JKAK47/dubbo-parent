package org.luisyang.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 发布服务 
 * 
 * @author night
 */
public class ProviderTest {


	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		
		context.start();
		
		System.in.read();
	}

}
