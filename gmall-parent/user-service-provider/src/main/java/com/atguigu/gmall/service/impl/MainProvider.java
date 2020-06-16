package com.atguigu.gmall.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
