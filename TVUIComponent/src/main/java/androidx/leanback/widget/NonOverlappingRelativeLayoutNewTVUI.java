package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class NonOverlappingRelativeLayoutNewTVUI extends RelativeLayout {
    public NonOverlappingRelativeLayoutNewTVUI(Context context) {
        this(context, null);
    }

    public NonOverlappingRelativeLayoutNewTVUI(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public NonOverlappingRelativeLayoutNewTVUI(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * Avoid creating hardware layer when Transition is animating alpha.
     */
    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }
}