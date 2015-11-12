package br.com.aquinofb.basicandroidapiclient.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.aquinofb.basicandroidapiclient.R;

/**
 * Created by felipeaquino on 12/11/15.
 */
public class MainFragment extends BaseFragment {

    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        context = getActivity();

        return view;
    }
}
