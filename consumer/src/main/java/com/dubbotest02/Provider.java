package com.dubbotest02;

import com.dubbotest01.inf.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jerry on 7/27/17.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        IDemoService demoService = (IDemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello );

//        System.in.read(); // 按任意键退出
    }

}
