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

public class UserResponse {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long questionId;
    private  String userAnswer;
    private String userName;

    public UserResponse()
    {

    }

    public UserResponse(Long questionId, String userAnswer, String userName)
    {
        this.questionId=questionId;
        this.userAnswer=userAnswer;
        this.userName=userName;
    }

}
