package com.test.resources;

import com.codahale.metrics.annotation.Timed;
import com.test.api.Saying;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
//import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/fibonacci")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    /* private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    
    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    } */

    private final String elements;

    public HelloWorldResource(String elements) {

        this.elements=elements;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        //String value = String.format(template, name.orElse(defaultName));
        String value=elements;
        final int value2=Integer.parseInt(value.toString().trim());
        //return new Saying(counter.incrementAndGet(), value);
        List<Integer> ls=new ArrayList<>();
        Fiobnanc fb=new Fiobnanc();
        ls=fb.Fibonacci(value2);
        return new Saying(ls, fb.sortList(ls));
    }
}