package com.example.android.foodfinder.sync;

import android.app.IntentService;
import android.content.Intent;


public class PlacesPullIntentService extends IntentService {

    public PlacesPullIntentService() {
        super(PlacesPullIntentService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        String location = intent.getStringExtra("current_location");
        PlacesPullJob.getNearByPlaces(getApplicationContext(), location);
    }
}
