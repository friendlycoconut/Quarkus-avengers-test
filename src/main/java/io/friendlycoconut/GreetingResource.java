package io.friendlycoconut;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    //test of instrumentation reload property in Quarkus ( Instrumentation based restart enabled)
    private AtomicInteger counter = new AtomicInteger(0);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("counter" + counter.getAndIncrement());
        return "Hello from RESTEasy Reactive";
    }
}
