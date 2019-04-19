package com.example.jasminwificonnect;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionWifi {

    Context context;
    public ConnectionWifi(Context context) {
        this.context = context;
    }

    public boolean isConnected(){
        ConnectivityManager Connectivity = (ConnectivityManager)
                context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if(Connectivity != null){
            NetworkInfo info = Connectivity.getActiveNetworkInfo();

            if(info !=null){
                if(info.getState()==NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        } return false;

    }
}
