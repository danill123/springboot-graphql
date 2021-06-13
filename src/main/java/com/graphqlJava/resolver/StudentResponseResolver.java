package com.graphqlJava.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphqlJava.entity.Subject;
import com.graphqlJava.response.StudentResponse;
import com.graphqlJava.response.SubjectReponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectReponse> getLearningSubjects(StudentResponse studentResponse) {
        List<SubjectReponse> learningSubjects = new ArrayList<SubjectReponse>();
        if(studentResponse.getStudent().getLearningSubjects() != null) {
            for(Subject subject: studentResponse.getStudent().getLearningSubjects()) {
                learningSubjects.add(new SubjectReponse(subject));
            }
        }

        return learningSubjects;
    }

    public String getFullName(StudentResponse studentResponse) {
        return studentResponse.getFirstName() + " " + studentResponse.getLastName();
    }

}
