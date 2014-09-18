package org.istbd.IST_Syllabus;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ActionProvider;


public class Credit extends Activity {

    private ActionBar actionbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionbar = getActionBar();
        actionbar.setTitle("CREDIT");
        actionbar.setIcon(R.drawable.action_bar_credit);

        setContentView(R.layout.credit);
    }

}