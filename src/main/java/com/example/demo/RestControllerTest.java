package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class RestControllerTest {
	
	@RequestMapping(method = RequestMethod.GET, value = "/demo/v1/status")
    @ResponseBody
    Mono<String> status(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
        return Mono.just("hello this is my first git commit");
    }
}
