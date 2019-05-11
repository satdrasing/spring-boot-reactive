package io.satendra.reactivedemo.controller;

import io.satendra.reactivedemo.documents.HelloDocument;
import io.satendra.reactivedemo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class HelloController {


    private HelloService helloService;


    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<HelloDocument> getDoc() {

        return helloService.getHelloDoc();
    }

    public HelloService getHelloService() {
        return helloService;
    }


    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
