package com.example.freefoodtracker.Model;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.io.DataInput;

public class Data {

    private static Data DataInstance = null;
    public LatLng curChoice;

    public static Data getInstance()
    {
        if (DataInstance == null)
            DataInstance = new Data();

        return DataInstance;
    }
}
