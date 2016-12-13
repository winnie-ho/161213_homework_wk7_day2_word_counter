package com.example.user.homeworkwk7day2wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter {
    private ArrayList<String> wordCounter;

//  Constructor
    public WordCounter(){
        this.wordCounter = new ArrayList<String>();
    }

//  Methods
    public ArrayList getWordCounter(){
        return this.wordCounter;
    }

    public int size(){
        return wordCounter.size();
    }

    public void addWords(String word){
        wordCounter.add(word);
    }

    public void addSplitWords(String input){
        String[] array = input.split(" ");
        for (String word : array) {
            wordCounter.add(word);
        }
    }

}
