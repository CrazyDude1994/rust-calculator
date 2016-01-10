package com.crazydude.rustcalculator;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Crazy on 08.01.2016.
 */
public class CraftItemAmount {

    private int amount;
    private int craftItem;
    private String name;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCraftItem() {
        return craftItem;
    }

    public void setCraftItem(int craftItem) {
        this.craftItem = craftItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
