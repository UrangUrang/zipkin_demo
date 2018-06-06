package com.urangurang.msapractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsaPracticeApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsaPracticeApplication.class, args);
  }
}

@RestController
class ZipkinController {

  @Autowired RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  private static final Logger LOG = LoggerFactory.getLogger(ZipkinController.class.getName());

  @GetMapping(value="/zipkin3")
  public String zipkinService1() throws InterruptedException {
    LOG.info("Inside zipkinService 3..");
//    Thread.sleep(1500);
    return "Hi...";
  }
}