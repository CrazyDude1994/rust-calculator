package com.crazydude.rustcalculator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class CraftItemView extends RelativeLayout {

    private TextView mNameText;
    private TextView mDescriptionText;

    public CraftItemView(Context context) {
        super(context);
        init();
    }

    public CraftItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CraftItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(value = 21)
    public CraftItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        View view = inflate(getContext(), R.layout.view_craft_item, this);
        mNameText = (TextView) view.findViewById(R.id.view_craft_item_name_text);
        mDescriptionText = (TextView) view.findViewById(R.id.view_craft_item_description_text);
    }

    public void setData(CraftItem data) {
        if (data != null) {
            mNameText.setText(data.getName());
            mDescriptionText.setText("");
        }
    }
}
