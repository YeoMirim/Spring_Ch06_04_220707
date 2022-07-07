package com.mirim.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration				// container class가 된다는 의미
@ImportResource("classpath:applicationCTX.xml")				// XML 파일을 불러와라 (Bean 사용가능)
public class ApplicationConfig {

	@Bean							// Bean 객체 생성
	public Student student1() { 	// Bean으로 사용되는 메소드, 반환되는 자료타입이 Student, student1은 Bean의 이름
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("운동");
		hobbys.add("노래");
		
		Student student = new Student("홍길동", 25, hobbys);
		student.setWeight(80);	// 생성자가 없으므로 이렇게 만듬
		student.setHeight(180);
		
		return student;		// 생성자만 있다면 return으로 반환
	}
	
	
	@Bean
	public Student student2() { 	// Bean으로 사용되는 메소드, 반환되는 자료타입이 Student, student1은 Bean의 이름
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("요리");
		hobbys.add("그림");
		
		Student student = new Student("김유신", 19, hobbys);		// 생성자에 설정
		student.setWeight(70);	// 프로퍼티에 설정, 생성자가 없으므로 이렇게 만듬
		student.setHeight(170);
		
		return student;		// 생성자만 있다면 return으로 반환
	}
}
