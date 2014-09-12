package org.istbd.IST_Syllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IST_Syllabus extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Go to next page with splash animation.
        goToNextPage();
    }

    /**
     * Splash handing method.
     */
    public void goToNextPage(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent menuIntent = new Intent(IST_Syllabus.this, Navigation.class);
                IST_Syllabus.this.startActivity(menuIntent);
                IST_Syllabus.this.finish();
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
            }
        }, 5000);
    }

}
