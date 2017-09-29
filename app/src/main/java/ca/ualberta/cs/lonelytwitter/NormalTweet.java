package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * NormalTweet extends the Tweet class and implements the
 * abstract method isImportant() in order to return FALSE. Also
 * implements the Tweetable interface.
 * @author Hugh Craig
 * @since 09-29-2017
 * @see ImportantTweet
 * @see Tweet
 * @see Tweetable
 */
public class NormalTweet extends Tweet implements Tweetable{

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
