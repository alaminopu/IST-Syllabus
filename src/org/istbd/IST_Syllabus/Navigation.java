package org.istbd.IST_Syllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.capricorn.ArcMenu;

/**
 * Navigation page for Syllabus
 */
public class Navigation extends Activity {
    private static final int[] ITEM_DRAWABLES = { R.drawable.ece_button, R.drawable.cse_button,
            R.drawable.bba_button,R.drawable.credit_button};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        ArcMenu arcMenu = (ArcMenu) findViewById(R.id.arc_menu);
        initArcMenu(arcMenu, ITEM_DRAWABLES);
    }

    private void initArcMenu(ArcMenu menu, int[] itemDrawables) {
        final int itemCount = itemDrawables.length;
        final String[] names = {"ECE", "CSE", "BBA","CREDIT"};
        for (int i = 0; i < itemCount; i++) {
            ImageView item = new ImageView(this);
            item.setImageResource(itemDrawables[i]);
            final int position = i;
            menu.addItem(item, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Navigation.this,names[position], Toast.LENGTH_SHORT).show();
                    if (names[position].equals("ECE")){
                        Intent nextView = new Intent(Navigation.this, ECE_syllabus.class);
                        startActivity(nextView);
                    }else if(names[position].equals("CSE")){
                        Intent nextView = new Intent(Navigation.this, CSE_syllabus.class);
                        startActivity(nextView);
                    }else if(names[position].equals("BBA")){
                        Intent nextView = new Intent(Navigation.this, BBA_syllabus.class);
                        startActivity(nextView);
                    }else if(names[position].equals("CREDIT")){
                        Intent nextView = new Intent(Navigation.this, Credit.class);
                        startActivity(nextView);
                    }

                }
            });
        }
    }

}