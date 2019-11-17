package com.example.freefoodtracker.Model;

import android.location.Location;

public class Food {

    private String type;
    private Location loc;

    public Food(String type, Location loc) {
        this.type = type;
        this.loc = loc;
    }


}
