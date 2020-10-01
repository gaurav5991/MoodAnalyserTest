package com.moodanalyser;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {
    @BeforeClass
    public static void beforeClass(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.printWelcomeMessage();
    }

    @Test
    public void GivenMessage_When_Sad_returnsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in a Sad Mood");
        Assert.assertEquals("SAD", result);
    }
    @Test
    public void GivenMessage_When_Happy_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in any Mood");
        Assert.assertEquals("HAPPY", result);
    }
}
