package com.example.quizCRUD;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctOption;
    public Questions()
    {}
    public Questions(String questionText,String option1, String option2,String option3,String option4,String correctOption )
    {
        this.questionText=questionText;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
        this.correctOption=correctOption;
    }
}
