package br.com.aquinofb.basicandroidapiclient.api;

import br.com.aquinofb.basicandroidapiclient.entities.User;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by felipeaquino on 17/11/15.
 */
public interface BasicApiService {
    static final String ACCEPT_APPLICATION_JSON = "Accept: application/json";
    static final String CONTENT_TYPE_APPLICATION_JSON = "Content-Type: application/json";
    static final String TOKEN = "Auth-Token";

    @Headers({ACCEPT_APPLICATION_JSON, CONTENT_TYPE_APPLICATION_JSON})
    @POST("/authentications/sign_in")
    void signIn(@Body User user, Callback<User> callback);

    @Headers({ACCEPT_APPLICATION_JSON, CONTENT_TYPE_APPLICATION_JSON})
    @POST("/authentications/sign_up")
    void signUp(@Body User user, Callback<User> callback);
}


