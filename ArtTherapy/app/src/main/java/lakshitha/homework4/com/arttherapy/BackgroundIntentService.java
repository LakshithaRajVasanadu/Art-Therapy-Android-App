package lakshitha.homework4.com.arttherapy;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by lakshitha on 2/23/16.
 */
public class BackgroundIntentService  extends IntentService{

    public BackgroundIntentService()
    {
        super("BackgroundIntentService");

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.eraser);
            mediaPlayer.start();
            while(mediaPlayer.isPlaying()) {
                System.out.println();
            }
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer.stop();
        }catch (Exception e) {

        }

    }
}
