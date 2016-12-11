package pe.area51.eventsdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyLocalBroadcastReceiver myLocalBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_send_broadcast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMyCustomBroadcast();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerLocalBroadcastReceiver();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterLocalBroadcastReceiver();
    }

    private void registerLocalBroadcastReceiver() {
        myLocalBroadcastReceiver = new MyLocalBroadcastReceiver();
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(myLocalBroadcastReceiver, intentFilter);
    }

    private void unregisterLocalBroadcastReceiver() {
        unregisterReceiver(myLocalBroadcastReceiver);
    }

    private void sendMyCustomBroadcast() {
        final Intent intent = new Intent(this, MyBroadcastReceiver.class);
        sendBroadcast(intent);
    }

    private class MyLocalBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "MainActivity", Toast.LENGTH_SHORT).show();
        }
    }
}
