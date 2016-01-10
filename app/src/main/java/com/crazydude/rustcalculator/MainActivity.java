package com.crazydude.rustcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import io.realm.Realm;
import io.realm.internal.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream is = null;
        try {
            is = getAssets().open("data/db.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        Realm realm = Realm.getInstance(this);

        realm.beginTransaction();
        try {
            realm.createAllFromJson(CraftItem.class, is);
            realm.commitTransaction();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main_placeholder, ItemListFragment.newInstance())
                .commit();
    }
}
