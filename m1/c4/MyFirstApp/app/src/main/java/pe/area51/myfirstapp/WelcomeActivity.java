package pe.area51.myfirstapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alumno on 12/7/16.
 */

public class WelcomeActivity extends AppCompatActivity {

    public final static String ARG_NAME = "pe.area51.myfirstapp.WelcomeActivity.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final TextView textViewWelcomeMessage = (TextView) findViewById(R.id.textview_welcome_message);
        final String name = getIntent().getStringExtra(ARG_NAME);
        textViewWelcomeMessage.setText(getString(R.string.welcome_message, name));
    }
}
