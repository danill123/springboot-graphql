package com.graphqlJava.response;

import com.graphqlJava.entity.Subject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubjectReponse {
    private Long id;
    private String subjectName;
    private Double marksObtained;
    public SubjectReponse(Subject subject) {
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
