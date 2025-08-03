package com.fr.repo.man.git_management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GitManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int additionSolution= addition(4,5);
		System.out.println(additionSolution);
		System.out.println(multiplication(10,10));
	}
	int addition(int a,int b){
		return a+b;
	}
	int multiplication(int a,int b){
		return a*b;
	}

}
