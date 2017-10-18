package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        text = (TextView) findViewById(R.id.textView2);

    }

    protected void onStart() {
        super.onStart();
        Intent i = getIntent();
        text.setText(i.getStringExtra("tweet"));
    }
}
