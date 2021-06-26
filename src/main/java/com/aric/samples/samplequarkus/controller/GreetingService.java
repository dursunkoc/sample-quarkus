package com.aric.samples.samplequarkus.controller;

import com.aric.samples.samplequarkus.domain.Greeting;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    @ConfigProperty(name = "greeting.prefix", defaultValue = "Hello ")
    private String greeting;

    public Greeting greet(String name) {
        return Greeting//
                .builder()//
                .greeting(greeting)//
                .name(name)//
                .build();
    }
}
