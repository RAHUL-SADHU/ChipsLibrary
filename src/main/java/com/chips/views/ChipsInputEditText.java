package com.chips.views;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;

public class ChipsInputEditText extends android.support.v7.widget.AppCompatEditText  {

    private FilterableListView filterableListView;

    public ChipsInputEditText(Context context) {
        super(context);
    }

    public ChipsInputEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isFilterableListVisible() {
        return filterableListView != null && filterableListView.getVisibility() == VISIBLE;
    }

    public FilterableListView getFilterableListView() {
        return filterableListView;
    }

    public void setFilterableListView(FilterableListView filterableListView) {
        this.filterableListView = filterableListView;
    }

    @Override
    public void setImeOptions(int imeOptions) {
        super.setImeOptions(EditorInfo.IME_ACTION_NEXT);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        return super.onTouchEvent(event);

    }
}
