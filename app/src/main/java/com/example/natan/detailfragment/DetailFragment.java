package com.example.natan.detailfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DetailFragment extends Fragment {

    private EditText textFirstName, textLastName, textAge;

    public DetailFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        textFirstName = (EditText) rootView.findViewById(R.id.textFirstName);
        textLastName = (EditText) rootView.findViewById(R.id.textLastName);
        textAge = (EditText) rootView.findViewById(R.id.textAge);

        Button doneButton = (Button) rootView.findViewById(R.id.done_button);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                done();
            }
        });
        return rootView;
    }

    private void done() {

    }

}
