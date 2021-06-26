package com.aric.samples.samplequarkus.controller;

import com.aric.samples.samplequarkus.domain.Greeting;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class GreetingController{
    @Inject
    private GreetingService greetingService;

    @GET()
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting greeting(@PathParam("name") String name){
        return greetingService.greet(name);
    }
}