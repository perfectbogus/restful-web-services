package com.bogus.rest.webservices.restfulwebservices.helloWorld;

import com.bogus.rest.webservices.restfulwebservices.helloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

/**
 * Some considerations:
 * - Tell to Spring that this is a controller
 * - which type of request we are going to response
 * - which URI we are going to response
 * - What are going to return.
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
