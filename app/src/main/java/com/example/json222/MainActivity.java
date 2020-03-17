package com.example.json222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Gson gson= new Gson();

        /*
        aftab a= new aftab ("aftab",30,"sonuaftab96@gmail.com");
        String json = gson.toJson(a);
        */

        String json ="{\"firstname\" : \"aftab\", \"age\":30,\"mail\": \"sonuaftab96@gmail.com\"}";
        aftab a =gson.fromJson(json,aftab.class);
}
    }

