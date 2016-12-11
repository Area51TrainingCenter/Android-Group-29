package pe.area51.eventsdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.widget.Toast;

/**
 * Created by alumno on 12/9/16.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        final String message;
        if (intent.getComponent() == null && action != null) {
            switch (action) {
                case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                    if (intent.getBooleanExtra("state", false)) {
                        message = context.getString(R.string.airplane_mode_on);
                    } else {
                        message = context.getString(R.string.airplane_mode_off);
                    }
                    break;
                case LocationManager.PROVIDERS_CHANGED_ACTION:
                    message = context.getString(R.string.location_provider_status_changed);
                    break;
                default:
                    throw new IllegalStateException("This should never be executed!");
            }
        } else {
            message = "MyBroadcastReceiver";
        }
        showMessage(context, message);
    }

    private void showMessage(final Context context, final String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
