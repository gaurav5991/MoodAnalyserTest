package com.moodanalyser;

import org.junit.BeforeClass;

public class MoodAnalyserTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.printWelcomeMessage();
    }
}
