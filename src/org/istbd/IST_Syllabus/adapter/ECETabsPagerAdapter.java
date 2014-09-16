package org.istbd.IST_Syllabus.adapter;

import org.istbd.IST_Syllabus.*;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ECETabsPagerAdapter extends FragmentPagerAdapter {

    public ECETabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new ECE_1stSemester();
            case 1:
                return new ECE_2ndSemester();
            case 2:
                return new ECE_3rdSemester();
            case 3:
                return new ECE_4thSemester();
            case 4:
                return new ECE_5thSemester();
            case 5:
                return new ECE_6thSemester();
            case 6:
                return new ECE_7thSemester();
            case 7:
                return new ECE_8thSemester();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 8;
    }

}