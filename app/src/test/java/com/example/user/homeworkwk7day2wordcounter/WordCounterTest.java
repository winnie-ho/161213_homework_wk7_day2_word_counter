package com.example.user.homeworkwk7day2wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter();
    }

    @Test
    public void wordCounterStartsEmptyTest(){
        assertEquals(0,wordCounter.size());
    }

    @Test
    public void addWordsToWordCounterTest(){
        wordCounter.addWords("Test");
        assertEquals(1,wordCounter.size());
    }

    @Test
    public void addSplitWordsToCounterTest(){
        wordCounter.addSplitWords("I am a test you moron");
        assertEquals(6,wordCounter.size());
    }
}
