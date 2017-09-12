package com.example.android.glidetutorial.Model;

import java.io.Serializable;

/**
 * Created by Android on 9/12/2017.
 */

public class image implements Serializable {

    public String name;
    public String small,medium,large;
    public String timeStamp;

    public image(){}

    public image(String name,String small,String medium,String large,String timeStamp){
        this.name = name;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.timeStamp = timeStamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
