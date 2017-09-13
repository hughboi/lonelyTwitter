package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

public class Sad extends CurrentMood {
    public Sad(Date date) {
        super(date);
    }

    public String getMood(){
        return ":(";
    }
}
