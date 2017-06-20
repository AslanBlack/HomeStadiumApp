package com.homestadium.homestadium;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Sajah on 20/06/2017.
 */

public class EventModel {

    private String mTitle;
    private Date mDate;
    private Time mTime;


    public EventModel(String title, Date date, Time time){
        mTitle = title;
        mDate = date;
        mTime = time;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public Time getmTime() {
        return mTime;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmTime(Time mTime) {
        this.mTime = mTime;
    }
}
