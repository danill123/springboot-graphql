package com.graphqlJava.response;

import com.graphqlJava.entity.Student;
import com.graphqlJava.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private List<SubjectReponse> learningSubjects;

    // this is for internal use. DO NOT PUT IN SCHEMA
    private Student student;
    private String fullName;

    public StudentResponse(Student student) {
        this.student = student;
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.street = student.getAddress().getStreet();
        this.city = student.getAddress().getCity();

        /*
        if(student.getLearningSubjects() != null) {
            learningSubjects = new ArrayList<SubjectReponse>();
            for(Subject subject: student.getLearningSubjects()) {
                learningSubjects.add(new SubjectReponse(subject));
            }
        }
        */
    }
}
