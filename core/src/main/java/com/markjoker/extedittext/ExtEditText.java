package com.markjoker.extedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by MaJian on 2015/11/13.
 */
public class ExtEditText extends RelativeLayout
{
    private TextView mDelView;
    private EditText mEditView;
    private static final int ID_DEL = 1001;
    public ExtEditText(Context context)
    {
        super(context);
        init();
    }
    
    public ExtEditText(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }
    
    public ExtEditText(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }
    
    private void init()
    {
        mEditView = new EditText(getContext());
        LayoutParams editParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        //editParams.addRule(LEFT_OF,ID_DEL);
        addView(mEditView,editParams);
    
        mDelView = new TextView(getContext());
        mDelView.setBackgroundResource(R.drawable.ic_cancel_grey600_24dp);
        LayoutParams delParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        delParams.addRule(ALIGN_PARENT_RIGHT);
        addView(mDelView, delParams);
    }
}
