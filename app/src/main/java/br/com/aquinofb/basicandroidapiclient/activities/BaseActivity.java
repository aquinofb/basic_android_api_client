package br.com.aquinofb.basicandroidapiclient.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

import br.com.aquinofb.basicandroidapiclient.R;

/**
 * Created by felipeaquino on 15/11/15.
 */
public class BaseActivity extends ActionBarActivity {
    public void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.transition_down_up_enter,
                        R.anim.transition_down_up_exit,
                        R.anim.transition_down_up_enter,
                        R.anim.transition_down_up_exit
                )
                .addToBackStack(null)
                .replace(R.id.container, fragment)
                .commit();
    }
}
