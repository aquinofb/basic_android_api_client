package br.com.aquinofb.basicandroidapiclient.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;

import br.com.aquinofb.basicandroidapiclient.activities.BaseActivity;

/**
 * Created by felipeaquino on 11/11/15.
 */
public class BaseFragment extends Fragment {

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    public ActionBar getActionBar() {
        return getBaseActivity().getSupportActionBar();
    }

    public void openFragment(Fragment fragment) {
        getBaseActivity().openFragment(fragment);
    }
}
