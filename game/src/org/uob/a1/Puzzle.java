package org.uob.a1;

public class Puzzle {
    private String description;
    private String correctAnswer;
    private String failureText;
    private String name;
    private String answerInputDescription;
    private String correctAnswerText;

    public Puzzle(String name, String description, String correctAnswer, String failureText, String answerInputDescription, String correctAnswerText) {
        this.failureText = failureText;
        this.description = description;
        this.correctAnswer = correctAnswer;
        this.name = name;
        this.answerInputDescription = answerInputDescription;
        this.correctAnswerText = correctAnswerText;
    }
    public String getCorrectAnswerText() {
        return correctAnswerText;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getFailureText() {
        return failureText;
    }

    public String getAnswerInputDescription() {
        return answerInputDescription;
    }
}
