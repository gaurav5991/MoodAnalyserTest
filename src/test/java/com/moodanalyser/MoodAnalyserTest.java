package com.moodanalyser;

import org.junit.Assert;
import org.junit.Before;
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
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void GivenMessage_When_Happy_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void GivenMessage_nullMood_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
