package com.test.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {

    @JsonProperty
    private List<?> fibonacci;
    @JsonProperty
    private List<?> sorted;

    public Saying() {
        // Jackson deserialization
    }



    public Saying(List<Integer> fibonacci, List<Integer> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }
    

    
    public List<?> getFibonacci() {
        return fibonacci;
    }
   // @JsonProperty
    public List<?> getSorted() {
        return sorted;
    }

}
