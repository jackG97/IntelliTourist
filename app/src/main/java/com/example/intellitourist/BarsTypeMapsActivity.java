package com.example.intellitourist;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class BarsTypeMapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    private Marker barsMarkers;
    private Marker barsMarkers1;
    private Marker barsMarkers2;
    private Marker barsMarkers3;
    private Marker barsMarkers4;
    private Marker barsMarkers5;
    private Marker barsMarkers6;
    private Marker barsMarkers7;
    private Marker barsMarkers8;
    private Marker barsMarkers9;


    private Marker nightclubsMarkers;
    private Marker nightclubsMarkers1;
    private Marker nightclubsMarkers2;
    private Marker nightclubsMarkers3;
    private Marker nightclubsMarkers4;
    private Marker nightclubsMarkers5;
    private Marker nightclubsMarkers6;
    private Marker nightclubsMarkers7;
    private Marker nightclubsMarkers8;
    private Marker nightclubsMarkers9;
    private Marker nightclubsMarkers10;

    private Button Bars;
    private Button Clubs;
    private Button All;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars_type_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bars = (Button) findViewById(R.id.BarsBtn);
        Clubs = (Button) findViewById(R.id.NightclubsBtn);
        All = (Button) findViewById(R.id.allBtn);



        Bars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barsview(view);
            }
        });

        Clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clubsview(view);
            }
        });

        All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allview(view);
            }
        });

    }


    public void barsview(View view){
        barsMarkers.setVisible(true);
        barsMarkers1.setVisible(true);
        barsMarkers2.setVisible(true);
        barsMarkers3.setVisible(true);
        barsMarkers4.setVisible(true);
        barsMarkers5.setVisible(true);
        barsMarkers6.setVisible(true);
        barsMarkers7.setVisible(true);
        barsMarkers8.setVisible(true);
        barsMarkers9.setVisible(true);


        nightclubsMarkers.setVisible(false);
        nightclubsMarkers1.setVisible(false);
        nightclubsMarkers2.setVisible(false);
        nightclubsMarkers3.setVisible(false);
        nightclubsMarkers4.setVisible(false);
        nightclubsMarkers5.setVisible(false);
        nightclubsMarkers6.setVisible(false);
        nightclubsMarkers7.setVisible(false);
        nightclubsMarkers8.setVisible(false);
        nightclubsMarkers9.setVisible(false);
        nightclubsMarkers10.setVisible(false);



    }

    public void clubsview(View view){
        barsMarkers.setVisible(false);
        barsMarkers1.setVisible(false);
        barsMarkers2.setVisible(false);
        barsMarkers3.setVisible(false);
        barsMarkers4.setVisible(false);
        barsMarkers5.setVisible(false);
        barsMarkers6.setVisible(false);
        barsMarkers7.setVisible(false);
        barsMarkers8.setVisible(false);
        barsMarkers9.setVisible(false);


        nightclubsMarkers.setVisible(true);
        nightclubsMarkers1.setVisible(true);
        nightclubsMarkers2.setVisible(true);
        nightclubsMarkers3.setVisible(true);
        nightclubsMarkers4.setVisible(true);
        nightclubsMarkers5.setVisible(true);
        nightclubsMarkers6.setVisible(true);
        nightclubsMarkers7.setVisible(true);
        nightclubsMarkers8.setVisible(true);
        nightclubsMarkers9.setVisible(true);
        nightclubsMarkers10.setVisible(true);

    }

    public void allview(View view){
        barsMarkers.setVisible(true);
        barsMarkers1.setVisible(true);
        barsMarkers2.setVisible(true);
        barsMarkers3.setVisible(true);
        barsMarkers4.setVisible(true);
        barsMarkers5.setVisible(true);
        barsMarkers6.setVisible(true);
        barsMarkers7.setVisible(true);
        barsMarkers8.setVisible(true);
        barsMarkers9.setVisible(true);


        nightclubsMarkers.setVisible(true);
        nightclubsMarkers1.setVisible(true);
        nightclubsMarkers2.setVisible(true);
        nightclubsMarkers3.setVisible(true);
        nightclubsMarkers4.setVisible(true);
        nightclubsMarkers5.setVisible(true);
        nightclubsMarkers6.setVisible(true);
        nightclubsMarkers7.setVisible(true);
        nightclubsMarkers8.setVisible(true);
        nightclubsMarkers9.setVisible(true);
        nightclubsMarkers10.setVisible(true);

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


        // Add a marker in Sydney and move the camera
        nightclubsMarkers = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335494, -6.263579)).title("Copper Face Jacks").snippet("Nightclub").snippet("11pm to 5am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335942, -6.263552)).title("Dicey's Garden Club").snippet("Nightclub").snippet("5pm to 2am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348158, -6.261998)).title("The Academy").snippet("Nightclub").snippet("11pm to 3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335963, -6.265538)).title("The Camden").snippet("Nightclub").snippet("10am - 12am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers4 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343390, -6.264263)).title("The Globe").snippet("Nightclub").snippet("7pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers5 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345526, -6.266388)).title("The Workman's Club").snippet("Nightclub").snippet("7pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers6 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343782, -6.264686)).title("The George").snippet("Nightclub").snippet("7pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers7 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344904, -6.262187)).title("Club M").snippet("Nightclub").snippet("11pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers8 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.342540, -6.262214)).title("ZavedeniE Nightclub").snippet("Nightclub").snippet("11pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers9 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.336783, -6.266302)).title("Opium").snippet("Nightclub").snippet("11pm-4am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers10 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.337951, -6.252723)).title("Xico").snippet("Nightclub").snippet("9pm-3am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));



        barsMarkers = mMap.addMarker(new MarkerOptions().position(new LatLng(53.336163, -6.265102)).title("Flannery's Bar").snippet("Bar").snippet("6pm-2am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345139, -6.265858)).title("Bab Bobs").snippet("Bar").snippet("12pm-2am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348158, -6.261998)).title("River Bar").snippet("Bar").snippet("11am-2am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345228, -6.267419)).title("Porterhouse Temple Bar").snippet("Bar").snippet("10pm-12am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers4 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345170, -6.262892)).title("Vintage Cocktail Club").snippet("Bar").snippet("3pm-1am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers5= mMap.addMarker(new MarkerOptions().position(new LatLng(53.341157, -6.262366)).title("Bar Rua").snippet("Bar").snippet("2pm-2am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers6 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.340170, -6.258750)).title("Peruke & Periwig").snippet("Bar").snippet("12pm-12am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers7 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.338367, -6.254158)).title("O'Donoghues Bar").snippet("Bar").snippet("11am-2pm").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers8 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335648, -6.265455)).title("Devitts Pub").snippet("Bar").snippet("10am-12am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers9 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335648, -6.265455)).title("Capitol bar").snippet("Bar").snippet("12pm-1am").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));


    }
}
