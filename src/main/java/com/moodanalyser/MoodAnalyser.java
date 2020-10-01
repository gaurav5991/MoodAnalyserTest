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

    public String analyseMood(String message) throws MoodAnalysisException {
      this.message = message;
      return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalysisException("Please Enter Proper Message");
        }

    }
}
