package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by Hugh on 2017-10-13.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        Tweet tweet1 = new NormalTweet("Test tweet");
        Exception caughtException = new Exception();
        try {
            tweets.add(tweet1);
        } catch(Exception e){
            caughtException = e;
        }

        assertTrue(caughtException.getClass() == IllegalArgumentException.class);
    }


    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");
        Tweet sameTweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(sameTweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test tweet 1");
        Tweet tweet2 = new NormalTweet(("test tweet 2"));
        tweets.add(tweet1); tweets.add(tweet2);

        assertTrue(tweets.getCount() == 2);
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test tweet 1");
        Tweet tweet2 = new NormalTweet(("test tweet 2"));
        tweets.add(tweet1); tweets.add(tweet2);

        ArrayList<Tweet> returnedTweetList = tweets.getTweets();
        assertTrue(returnedTweetList.indexOf(tweet1) == 0 && returnedTweetList.indexOf(tweet2) == 1);
    }
}
