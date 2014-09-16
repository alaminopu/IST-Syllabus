package org.istbd.IST_Syllabus.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import org.istbd.IST_Syllabus.*;

public class BBATabsPagerAdapter extends FragmentPagerAdapter {

    public BBATabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new BBA_1stSemester();
            case 1:
                return new BBA_2ndSemester();
            case 2:
                return new BBA_3rdSemester();
            case 3:
                return new BBA_4thSemester();
            case 4:
                return new BBA_5thSemester();
            case 5:
                return new BBA_6thSemester();
            case 6:
                return new BBA_7thSemester();
            case 7:
                return new BBA_8thSemester();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 8;
    }

}