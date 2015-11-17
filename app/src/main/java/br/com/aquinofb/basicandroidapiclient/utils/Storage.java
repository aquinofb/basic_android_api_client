package br.com.aquinofb.basicandroidapiclient.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import br.com.aquinofb.basicandroidapiclient.entities.User;

/**
 * Created by felipeaquino on 14/11/15.
 */
public class Storage {

    private static final String PREFS_NAME = "BASIC_API_PREFS";
    Context mContext;
    private SharedPreferences settings;

    protected static final String USER_KEY = "user";

    public Storage(Context context) {
        mContext = context;
        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setUser(User user) {
        saveData(USER_KEY, user, settings.edit());
    }

    private void saveData(String key, Object data, SharedPreferences.Editor editor) {
        Gson gson = new Gson();
        String json = gson.toJson(data);
        editor.putString(key, json);
        editor.commit();
    }

    public User getUser() {
        Gson gson = new Gson();
        String json = settings.getString(USER_KEY, "");
        return gson.fromJson(json, User.class);
    }

    public String getUserToken() {
        User user = getUser();
        if (user != null)
            return user.authentication_token;

        return "";
    }
}
