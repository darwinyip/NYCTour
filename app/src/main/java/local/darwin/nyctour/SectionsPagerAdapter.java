package local.darwin.nyctour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Returns corresponding fragment based on Pager position.
     *
     * @param position Current Pager position
     * @return Fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new PublicFragment();
        } else {
            return new TerminalFragment();
        }

    }

    /**
     * Gets count of Fragments
     *
     * @return Number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }
}