package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class DemoApplication {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	@ResponseBody
	public Greeting home() {
		return new Greeting(1L, String.format(template, "Hello"));
	}

	@RequestMapping("/greeting")
	@ResponseBody
	public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting(1L, String.format(template, name));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
