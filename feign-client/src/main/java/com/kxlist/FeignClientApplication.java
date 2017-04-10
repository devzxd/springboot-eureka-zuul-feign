package com.kxlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
//@EnableCircuitBreaker
public class FeignClientApplication {
	/*@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}
}
