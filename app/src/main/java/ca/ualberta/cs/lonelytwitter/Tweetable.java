package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweetable.java
 * An interface class that specifies to implementors that in order
 * for their classes to be Tweetable it must have a message, and a date.
 *
 * @author Hugh Craig
 * @since 09-29-2017
 */
public interface Tweetable {
    /**
     * Method that needs to be implemented in order to retrieve the message
     * of a tweetable object.
     * @return Returns a string representing the tweet.
     */
    String getMessage();

    /**
     * Mehod that needs to be implemented in order to retrieve the date
     * of a tweetable object.
     * @return Returns a date representing when the tweet was created.
     */
    Date getDate();
}
