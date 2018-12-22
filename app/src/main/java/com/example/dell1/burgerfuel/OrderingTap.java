package com.example.dell1.burgerfuel;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OrderingTap extends android.support.v4.app.Fragment {
   private Button b1,b2;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ordering_tap,
                container, false);

        b1=(Button)view.findViewById(R.id.Login);
        b2=(Button)view.findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getActivity(),
                  LoginActivity.class);
            startActivity(intent);
           }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),
                        RegisterActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}