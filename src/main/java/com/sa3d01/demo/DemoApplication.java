package com.sa3d01.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		HashMap<Integer,String> students = new HashMap<>();
		students.put(1, "Jai");
		students.put(3, "Mahesh");
		students.put(2, "Vishal");
		students.put(4, "Hemant");
		students.put(5, "Narender");

		//Print HashMap objects
		for (Map.Entry entry : students.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
//		SpringApplication.run(DemoApplication.class, args);
	}

}
