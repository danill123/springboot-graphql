package com.graphqlJava.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqlJava.request.SampleRequest;

import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String firstQuery() {
        return "first query";
    }

    public String secondQuery() {
        return "second query";
    }

    public String fullName(SampleRequest sampleRequest){
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }
}
