package hari.broadcastreceiverviamanifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Hari on 31/01/16.
 */
public class IncomingSmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Yes! SMS Receved.", Toast.LENGTH_LONG).show();
    }
}
