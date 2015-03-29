package pro.asfert.criminalintent;

import android.app.Fragment;

/**
 * Created by darkwawe on 29.03.2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
