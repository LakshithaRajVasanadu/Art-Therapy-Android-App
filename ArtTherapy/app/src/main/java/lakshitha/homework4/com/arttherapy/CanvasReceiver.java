package lakshitha.homework4.com.arttherapy;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by lakshitha on 2/24/16.
 */
public class CanvasReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        int requestCode = 0;
        int flags = 0;
        Intent intent1 = new Intent(context, DrawActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(context, requestCode, intent1, flags);
        int id = 12345;
        Notification n  = new Notification.Builder(context)
                .setContentTitle("New Notification")
                .setContentText("Lets Draw!")
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentIntent(pIntent)
                .setAutoCancel(true)
                .build();

        NotificationManager notificationManager =
                (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);

        notificationManager.notify(id, n);

    }
}
