package com.example.dipanshkhandelwal.locationalert;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by DIPANSH KHANDELWAL on 20-07-2017.
 */

public class GeofenceTransitionsIntentService extends IntentService{

    protected static final String TAG = "gfservice";
    public GeofenceTransitionsIntentService() {
        super(TAG);
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
