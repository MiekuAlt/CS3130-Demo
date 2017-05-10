package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This gets called when the user presses the update button
    public void sendMessage(View view) {
        // Grabbing the components
        TextView textView = (TextView) findViewById(R.id.helloText);
        EditText newText = (EditText) findViewById(R.id.textInput);

        // Updating the values
        textView.setText(newText.getText());
        newText.setText(""); // Clearing what the user originally entered
    }
}
