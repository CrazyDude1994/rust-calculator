package com.crazydude.rustcalculator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by kartavtsev.s on 08.01.2016.
 */
public class CraftItemView extends RelativeLayout {

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

    }
}
