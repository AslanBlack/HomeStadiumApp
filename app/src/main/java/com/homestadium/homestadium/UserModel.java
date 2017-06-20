package com.homestadium.homestadium;

/**
 * Created by Sajah on 20/06/2017.
 */

public class UserModel {

    private String mUsername;
    private String mEmail;
    private String mPassword;
    private String mAddress;

    public UserModel(String username, String email, String password, String address){
        mUsername = username;
        mEmail = email;
        mPassword = password;
        mAddress = address;
    }

    public UserModel(String username, String email, String password){
        mUsername = username;
        mEmail = email;
        mPassword = password;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}
