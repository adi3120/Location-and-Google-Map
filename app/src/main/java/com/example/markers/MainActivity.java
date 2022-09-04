package com.example.markers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LatLng latLng=new LatLng(20,80);
        GoogleMap gm = null;

        MarkerOptions markerOptions=new MarkerOptions().position(latLng).title("Youarehere...!!");
        gm.addMarker(markerOptions);

    }
}