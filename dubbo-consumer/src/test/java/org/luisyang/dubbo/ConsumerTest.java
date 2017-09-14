package org.luisyang.dubbo;

import org.luisyang.dubbo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *  消费服务
 * 
 * @author night
 */
public class ConsumerTest {

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		context.start();
		
		HelloService helloService = (HelloService) context.getBean("helloService");
		int i  = 1; 
		while(true){			
			try {
				helloService.echo("word"+i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}		
			System.out.println("client :"+helloService.getName());
			Thread.sleep(1000);
			i ++;
		}
	}
}
