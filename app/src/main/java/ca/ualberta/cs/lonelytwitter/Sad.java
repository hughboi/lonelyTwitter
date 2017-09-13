package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

public class Sad extends CurrentMood {
    private int levelOfSadness;

    public Sad(){
        super();
    }
    public Sad(Date date) {
        super(date);
    }

    public String getMood(){
        return ":(";
    }
}
