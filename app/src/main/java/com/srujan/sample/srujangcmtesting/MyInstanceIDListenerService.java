package com.srujan.sample.srujangcmtesting;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by mobility on 16/12/15.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}

