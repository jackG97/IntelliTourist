package com.example.intellitourist;

import androidx.fragment.app.FragmentActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class RestuarantsMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker italian;
    private Marker italian1;
    private Marker italian2;
    private Marker fastfood;
    private Marker fastfood1;
    private Marker fastfood2;
    private Marker fastfood3;
    private Marker fastfood4;
    private Marker chinese;
    private Marker chinese1;
    private Marker chinese2;
    private Marker chinese3;
    private Marker cafe;
    private Marker cafe1;
    private Marker cafe2;
    private Marker cafe3;
    private Button Chinesebtn;
    private Button Cafebtn;
    private Button Fastbtn;
    private Button Itbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Chinesebtn = (Button) findViewById(R.id.chinese);
        Cafebtn = (Button) findViewById(R.id.Cafe);
        Fastbtn = (Button) findViewById(R.id.FastFood);
        Itbtn = (Button) findViewById(R.id.italian);

        Chinesebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chineseview(view);
            }
        });

        Cafebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cafeview(view);
            }
        });

        Fastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fastfoodview(view);
            }
        });

        Itbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                italianview(view);
            }
        });

    }


    public void chineseview(View view){
        chinese.setVisible(true);
        chinese1.setVisible(true);
        chinese2.setVisible(true);
        chinese3.setVisible(true);
        italian.setVisible(false);
        italian1.setVisible(false);
        italian2.setVisible(false);
        fastfood.setVisible(false);
        fastfood1.setVisible(false);
        fastfood2.setVisible(false);
        fastfood3.setVisible(false);
        fastfood4.setVisible(false);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(false);

    }

    public void cafeview(View view){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(false);
        italian.setVisible(false);
        italian1.setVisible(false);
        italian2.setVisible(false);
        fastfood.setVisible(false);
        fastfood1.setVisible(false);
        fastfood2.setVisible(false);
        fastfood3.setVisible(false);
        fastfood4.setVisible(false);
        cafe.setVisible(true);
        cafe1.setVisible(true);
        cafe2.setVisible(true);
        cafe3.setVisible(true);
    }

    public void fastfoodview(View view){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(false);
        italian.setVisible(false);
        italian1.setVisible(false);
        italian2.setVisible(false);
        fastfood.setVisible(true);
        fastfood1.setVisible(true);
        fastfood2.setVisible(true);
        fastfood3.setVisible(true);
        fastfood4.setVisible(true);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(false);
    }

    public void italianview(View view){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(false);
        italian.setVisible(true);
        italian1.setVisible(true);
        italian2.setVisible(true);
        fastfood.setVisible(false);
        fastfood1.setVisible(false);
        fastfood2.setVisible(false);
        fastfood3.setVisible(false);
        fastfood4.setVisible(false);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(false);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        italian = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350476, -6.256562)).title("The Italian Connection Restaurant").snippet("Italian").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        italian1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.346752, -6.264995)).title("Bar Italia ristorante").snippet("Italian").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        italian2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.347267, -6.262032)).title("Terra Madre").snippet("Italian").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        fastfood = mMap.addMarker(new MarkerOptions().position(new LatLng(53.340667, -6.260583)).title("Captain America").snippet("Fast Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343030, -6.259318)).title("Burger King").snippet("Fast Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344826, -6.263914)).title("Steakhouse Temple Bar").snippet("Fast Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.346408, -6.261422)).title("The Hungry Mexican Restaurant").snippet("Fast Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood4 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350824, -6.260933)).title("McDonalds").snippet("Fast Food").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        chinese = mMap.addMarker(new MarkerOptions().position(new LatLng(53.339036, -6.265793)).title("Bao House").snippet("Chinese").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348212, -6.261673)).title("Dragon Buffet").snippet("Chinese").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343680, -6.264141)).title("Charlies 4").snippet("Chinese").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343260, -6.260890)).title("Ka Shing Chinese Restaurant").snippet("Chinese").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        cafe = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350667, -6.266212)).title("Cafe Cucina").snippet("Cafe").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350246, -6.275863)).title("Cafe Oasis").snippet("Cafe").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348744, -6.266743)).title("The Church Café, Late Bar & Restaurant").snippet("Cafe").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344490, -6.267424)).title("Cafe Topolis").snippet("Cafe").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));






    }
}
