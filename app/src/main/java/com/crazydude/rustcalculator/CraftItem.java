package com.crazydude.rustcalculator;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class CraftItem {
    private String mName;
    private String mInfo;

    public CraftItem(String mName, String mInfo) {
        this.mName = mName;
        this.mInfo = mInfo;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        this.mInfo = mInfo;
    }
}
