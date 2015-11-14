package br.com.aquinofb.basicandroidapiclient.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by felipeaquino on 14/11/15.
 */


public class Storage {

    private static final String PREFS_NAME = "BASIC_API_PREFS";
    Context mContext;
    private SharedPreferences settings;

    public Storage(Context context) {
        mContext = context;
        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }
}
