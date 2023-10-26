package com.example.hello.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class HelloService {
    
    public void hello() {
        log.info("hello from service");
    }
}
