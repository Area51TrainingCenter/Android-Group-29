package pe.area51.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonShowWelcome = (Button) findViewById(R.id.button_show_welcome);
        final EditText editTextName = (EditText) findViewById(R.id.edittext_name);
        buttonShowWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = editTextName.getText().toString();
                final Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra(WelcomeActivity.ARG_NAME, name);
                startActivity(intent);
            }
        });
    }
}
