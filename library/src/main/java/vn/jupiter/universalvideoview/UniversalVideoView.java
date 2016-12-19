package vn.jupiter.universalvideoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class UniversalVideoView extends RelativeLayout {

    public UniversalVideoView(Context context) {
        super(context);
        initView(context, null);
    }

    public UniversalVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public UniversalVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public UniversalVideoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context, attrs);
    }

    public void initView(Context context, AttributeSet attrs) {

    }
}
