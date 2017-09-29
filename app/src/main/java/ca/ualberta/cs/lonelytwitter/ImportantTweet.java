package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * ImportantTweet extends the Tweet class and implements the
 * abstract method isImportant() in order to return TRUE. Also
 * implements the Tweetable interface.
 * @author Hugh Craig
 * @since 09-29-2017
 * @see NormalTweet
 * @see Tweet
 * @see Tweetable
 */
public class ImportantTweet extends Tweet implements Tweetable{

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
