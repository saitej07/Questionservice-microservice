package com.saiteja.question_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String rightAnswer;
    private String difficultylevel;
    private String category;
}
