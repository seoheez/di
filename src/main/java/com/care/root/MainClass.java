package com.care.root;

public class MainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();
		stBean.setName("Joy");
		stBean.setAge(26);
		
		stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
	}
}
