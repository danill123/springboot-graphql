package com.graphqlJava.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqlJava.request.SampleRequest;

import com.graphqlJava.response.StudentResponse;
import com.graphqlJava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private StudentService studentService;

    public String firstQuery() {
        return "first query";
    }

    public String secondQuery() {
        return "second query";
    }

    public String fullName(SampleRequest sampleRequest){
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }

    public StudentResponse getStudent(long id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
