package com.example.osman.sharedprefs;

public class Score
{
    int score;
    String person;

    public Score(String p, int s)
    {
        score = s;
        person = p;
    }



    public int getScore()
    {
    return score;
    }

    public String getPerson()
    {
   return person;
    }
}
