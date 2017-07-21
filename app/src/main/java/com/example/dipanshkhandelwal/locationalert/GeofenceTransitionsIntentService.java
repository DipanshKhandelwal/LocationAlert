package com.example.dipanshkhandelwal.locationalert;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;

import java.util.ArrayList;
import java.util.List;

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
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()){
            Log.e(TAG, errorMessage);
            return;
        }

        int geofenceTransition = geofencingEvent.getGeofenceTransition();

        if(geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER || geofenceTransition == Geofence.GEOFENCE_TRANSITION_EXIT){
            List<Geofence> triggeringGeofences  = geofencingEvent.getTriggeringGeofences();

            String geofencesTransitionsDetails = getGeofenceTransitionDetails(this, geofenceTransition, triggeringGeofences);
            // Send notification and log the transition details.
            sendNotification(geofencesTransitionsDetails);
            Log.i(TAG, geofenceTransitionsDetails);
        } else {
            // Log the error.
            Log.e(TAG, getString(R.string.geofence_transition_invalid_type, geofenceTransition));
        }

    }


    private String getGeofenceTransitionDetails(Context context, int geofenceTransition, List<Geofence> triggeringGeofences) {

    String geofenceTransitionString = getTransitionString(geofenceTransition);
        ArrayList triggeringGeofencesIdsList = new ArrayList();
        for(Geofence geofence : triggeringGeofences){
            triggeringGeofencesIdsList.add(geofence.getRequestId());
        }
        String triggeringGeofencesIdsString = TextUtils.join(", ",triggeringGeofencesIdsList);

        return geofenceTransitionString + ": " + triggeringGeofencesIdsString;
    }

    
}
