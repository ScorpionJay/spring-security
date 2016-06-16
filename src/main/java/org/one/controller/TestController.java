package org.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping(value="test")
    public String test() {
        return "test";
    }

	@RequestMapping(value="hello")
    public String hello() {
        return "hello";
    }

}
