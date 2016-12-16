package pe.area51.myfirstservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_start_service).setOnClickListener(this);
        findViewById(R.id.button_stop_service).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_start_service:
                startService();
                break;
            case R.id.button_stop_service:
                stopService();
                break;
        }
    }

    private void startService() {
        startService(new Intent(this, MyService.class));
    }

    private void stopService() {
        stopService(new Intent(this, MyService.class));
    }
}
