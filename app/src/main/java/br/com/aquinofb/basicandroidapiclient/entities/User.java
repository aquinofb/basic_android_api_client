package br.com.aquinofb.basicandroidapiclient.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by felipeaquino on 17/11/15.
 */
public class User implements Parcelable {
    public String id;
    public String name;
    public String email;
    public String password;
    public String authentication_token;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(name);
        parcel.writeString(email);
        parcel.writeString(id);
        parcel.writeString(authentication_token);
    }
}
