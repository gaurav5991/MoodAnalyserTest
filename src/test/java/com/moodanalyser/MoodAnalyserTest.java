package com.moodanalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @BeforeClass
    public static void beforeClass(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.printWelcomeMessage();
    }

    @Test
    public void GivenMessage_When_Sad_returnsSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void GivenMessage_When_Happy_returnsHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void Given_NullMoodShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood(null);
        }catch (MoodAnalysisException e){
            Assert.assertEquals("Please Enter Proper Message", e.getMessage());
        }
    }
}
