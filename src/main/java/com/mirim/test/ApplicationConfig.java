package com.mirim.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration				// container class�� �ȴٴ� �ǹ�
@ImportResource("classpath:applicationCTX.xml")				// XML ������ �ҷ��Ͷ� (Bean ��밡��)
public class ApplicationConfig {

	@Bean							// Bean ��ü ����
	public Student student1() { 	// Bean���� ���Ǵ� �޼ҵ�, ��ȯ�Ǵ� �ڷ�Ÿ���� Student, student1�� Bean�� �̸�
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("�");
		hobbys.add("�뷡");
		
		Student student = new Student("ȫ�浿", 25, hobbys);
		student.setWeight(80);	// �����ڰ� �����Ƿ� �̷��� ����
		student.setHeight(180);
		
		return student;		// �����ڸ� �ִٸ� return���� ��ȯ
	}
	
	
	@Bean
	public Student student2() { 	// Bean���� ���Ǵ� �޼ҵ�, ��ȯ�Ǵ� �ڷ�Ÿ���� Student, student1�� Bean�� �̸�
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("�丮");
		hobbys.add("�׸�");
		
		Student student = new Student("������", 19, hobbys);		// �����ڿ� ����
		student.setWeight(70);	// ������Ƽ�� ����, �����ڰ� �����Ƿ� �̷��� ����
		student.setHeight(170);
		
		return student;		// �����ڸ� �ִٸ� return���� ��ȯ
	}
}
