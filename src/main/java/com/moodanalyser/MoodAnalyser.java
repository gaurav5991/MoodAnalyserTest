package com.moodanalyser;

public class MoodAnalyser {
    public void printWelcomeMessage() {
        System.out.println("Welcome to Mood Analyser Program");
    }


    public String analyseMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
