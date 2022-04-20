package com.nisum.demo;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;
import com.nisum.demo.controller.HelloController;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@SpringBootApplication
public class DemoApplication {
	//private int value;

//	public static void metodoX(){
//		this.value = 10;
//	}
//
//	public void doSomething(){
//		this.value = 10;
//	}


//	private String nameApplication;
//	public DemoApplication(){
//
//	}
//	public DemoApplication(int value, String kk){
//		this.value = value;
//	}



	public static void main(String[] args) {


//		DemoApplication D = new DemoApplication();
//
//
//		SpringApplication s = new SpringApplication();
		//s.run();
		//SpringApplication.

		SpringApplication.run(DemoApplication.class, args);
	}

}
