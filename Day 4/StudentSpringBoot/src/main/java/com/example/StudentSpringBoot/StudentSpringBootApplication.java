package com.example.StudentSpringBoot;

import com.example.StudentSpringBoot.models.Students;
import com.example.StudentSpringBoot.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class StudentSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSpringBootApplication.class, args);
	}
}
