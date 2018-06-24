package local.darwin.nyctour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter extends FragmentPagerAdapter {

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
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new PublicFragment();
            default:
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