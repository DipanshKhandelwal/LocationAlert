package com.example.dipanshkhandelwal.locationalert;

/**
 * Created by DIPANSH KHANDELWAL on 22-07-2017.
 */


import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by lmoroney on 12/17/14.
 */
public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.example.dipanshkhandelwal.locationalert";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 1; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> MY_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        MY_LANDMARKS.put("HOME", new LatLng(28.370722, 77.325972));

        // Googleplex.
        MY_LANDMARKS.put("COLLEGE", new LatLng(23.258742, 72.651535));

        // Test
        MY_LANDMARKS.put("COFFEE SHOP", new LatLng(28.369272, 77.328552));
    }

}
