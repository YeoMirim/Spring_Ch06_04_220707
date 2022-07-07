package com.mirim.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// XML���� �θ��� ���
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("�̸� : " + student1.getName());
	
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("�̸� : " + student2.getName());
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println("�̸� : " + student3.getName());
		
		ctx.close();
	}
}


// Maven Dependencies�� ���̺귯�� ���� ��