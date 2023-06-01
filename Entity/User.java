package com.examples.demos.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("Question_id")
     private Long question_id;
    @JsonProperty(" Question_text")
        private String question_text;
    @JsonProperty(" Answer")
        private String answer;

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
