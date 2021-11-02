package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		STBean stBean = ctx.getBean("stb", STBean.class); //설정된 값을 꺼내와서 쓰는 방식
		//STBean stBean = new STBean(); //처리됨.
		//stBean.setName("Joy111");
		//stBean.setAge(26111);
		
		//stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
	}
}
