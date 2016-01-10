package com.crazydude.rustcalculator;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class CraftItem extends RealmObject {

    @PrimaryKey
    private int id;
    private String name;

    private ArrayList<CraftItemAmount> craftItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CraftItemAmount> getCraftItems() {
        return craftItems;
    }

    public void setCraftItems(ArrayList<CraftItemAmount> craftItems) {
        this.craftItems = craftItems;
    }
}
