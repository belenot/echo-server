package com.belenot.exp.echoserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo")
    public String echo(@RequestParam("text") String text) {
	return text;
    }
}
