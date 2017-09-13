package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

public abstract class Tweet {
    private String message;
    protected Date date;
    protected ArrayList<CurrentMood> listOfMoods;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.listOfMoods = new ArrayList<CurrentMood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.listOfMoods = new ArrayList<CurrentMood>();
    }

    public void addMood(CurrentMood mood){
        listOfMoods.add(mood);
    }

    public void removeMood(CurrentMood mood){
        listOfMoods.remove(mood);
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
