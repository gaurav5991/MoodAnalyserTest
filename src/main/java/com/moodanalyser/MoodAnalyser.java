package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public void printWelcomeMessage() {
        System.out.println("Welcome to Mood Analyser Program");
    }

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
      this.message = message;
      return analyseMood();
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
