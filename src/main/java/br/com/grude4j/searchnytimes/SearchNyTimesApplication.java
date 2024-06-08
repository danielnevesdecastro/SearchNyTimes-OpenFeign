package br.com.grude4j.searchnytimes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SearchNyTimesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchNyTimesApplication.class, args);
	}

}
