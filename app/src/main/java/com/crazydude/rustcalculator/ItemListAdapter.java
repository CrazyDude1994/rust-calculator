package com.crazydude.rustcalculator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private ArrayList<CraftItem> mCraftItems = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new CraftItemView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getItemView().setData(mCraftItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mCraftItems.size();
    }

    public void setData(ArrayList<CraftItem> data) {
        mCraftItems = data;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(CraftItemView itemView) {
            super(itemView);
        }

        public CraftItemView getItemView() {
            return (CraftItemView) itemView;
        }
    }
}
