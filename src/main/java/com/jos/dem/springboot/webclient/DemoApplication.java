package com.jos.dem.springboot.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jos.dem.springboot.webclient.service.BeverageService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  CommandLineRunner run(BeverageService beverageService){
    return args -> {
      beverageService.getBeverage(35L)
      .subscribe(System.out::println);
    };
  }

}
