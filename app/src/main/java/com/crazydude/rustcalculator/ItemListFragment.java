package com.crazydude.rustcalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class ItemListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public ItemListFragment() {
    }

    public static ItemListFragment newInstance() {
        return new ItemListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_item_list_recycler);

        ItemListAdapter itemListAdapter = new ItemListAdapter();

        Realm realm = Realm.getInstance(getContext());
        RealmResults<CraftItem> craftItems = realm.allObjects(CraftItem.class);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(itemListAdapter);
        itemListAdapter.setData(new ArrayList<>(craftItems));
        return view;
    }
}
