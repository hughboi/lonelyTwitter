package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

public abstract class CurrentMood {
    protected Date date;

    public CurrentMood(){
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
