package ca.ualberta.cs.lonelytwitter;

import android.util.Log;
import java.util.Date;

/**
 * Created by hughc on 2017-09-12.
 */

public class Happy extends CurrentMood {
    private int levelOfHappiness;

    public Happy(){
        super();
    }
    public Happy(Date date){
        super(date);
    }

    public String getMood(){
        return ":)";
    }
}
