package com.github.shareme.bleubutterfly.googlenavdrawermenu.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Checkable;

/**
 * Created by Arasthel on 15/04/14.
 */
public class CheckedTextView extends com.github.shareme.bluebutterfly.core.widget.TextView implements Checkable {

    private boolean checked = false;

    public CheckedTextView(Context context) {
        super(context);
    }

    public CheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public void setChecked(boolean b) {
        checked = b;
        if(isChecked()) {
            setTypeface(null, Typeface.BOLD);
        } else {
            setTypeface(null, Typeface.NORMAL);
        }
    }

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void toggle() {
        setChecked(!isChecked());
    }
}
