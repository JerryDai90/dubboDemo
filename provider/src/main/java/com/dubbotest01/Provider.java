package com.dubbotest01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jerry on 7/27/17.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        System.out.println("2222222");

        System.in.read(); // 按任意键退出
    }

}
