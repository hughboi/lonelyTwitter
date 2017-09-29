/*
 * Copyright (c) 2017. CMPUT 301. University of Alberta - All Rights Reserved. You may use, distribute, or modify
 *  this code under terms and conditions of the Code of Student Behavior at the University of Alberta. You may find a
 *  copy of the license in th project. Otherwise please contact hdc@ualbert.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

/**
 * Represents a tweet.
 *@author Hugh Craig
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
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

    /**
     * Constructs a tweet object using a message and date provided.
     * @param message message content of the tweet
     * @param date date tweet created
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.listOfMoods = new ArrayList<CurrentMood>();
    }

    /**
     * Adds a mood to the current list of moods for the tweet.
     * @param mood the mood you want to add to the tweet
     */
    public void addMood(CurrentMood mood){
        listOfMoods.add(mood);
    }

    /**
     * Removes a mood from the current list of moods for tweet.
     * @param mood the mood you want to remove from the tweet
     */
    public void removeMood(CurrentMood mood){
        listOfMoods.remove(mood);
    }

    /**
     * Abstract method that all tweets implement that determines whether a
     * tweet is important or not.
     * @return Returns a boolean signaling whether the tweet is important or not.
     */
    public abstract Boolean isImportant();

    /**
     * Sets the message of a tweet.
     * @param message message that will be set for tweet
     * @throws TweetTooLongException except thrown if tweet exceeds 140 characters
     */
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

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
