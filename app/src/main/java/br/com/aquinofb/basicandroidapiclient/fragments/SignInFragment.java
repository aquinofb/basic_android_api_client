package br.com.aquinofb.basicandroidapiclient.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.aquinofb.basicandroidapiclient.R;
import br.com.aquinofb.basicandroidapiclient.api.BasicApiService;
import br.com.aquinofb.basicandroidapiclient.entities.User;
import br.com.aquinofb.basicandroidapiclient.utils.Helper;
import br.com.aquinofb.basicandroidapiclient.utils.Storage;
import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by felipeaquino on 17/11/15.
 */
public class SignInFragment extends BaseFragment {

    private Context context;
    private Storage storage;

    final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Helper.host).build();
    final BasicApiService service = restAdapter.create(BasicApiService.class);

    @InjectView(R.id.sign_in)
    Button mSignIn;

    @InjectView(R.id.sign_up)
    Button mSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_in, container, false);
        ButterKnife.inject(this, view);

        context = this.getActivity();
        storage = new Storage(getActivity());

        getActionBar().setTitle("Sign in");

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView mEmail = (TextView) getActivity().findViewById(R.id.email);
                final TextView mPassword = (TextView) getActivity().findViewById(R.id.password);

                User user = new User();
                user.email = mEmail.getText().toString();
                user.password = mPassword.getText().toString();

                service.signIn(user, new Callback<User>() {

                    @Override
                    public void success(User user, Response response) {
                        storage.setUser(user);
                        Toast.makeText(getActivity(), "Success!", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getActivity(), "Deu errado", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Foi", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
