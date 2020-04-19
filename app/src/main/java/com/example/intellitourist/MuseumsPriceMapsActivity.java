package com.example.intellitourist;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MuseumsPriceMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker history;
    private Marker history1;
    private Marker history2;
    private Marker history3;
    private Marker science;
    private Marker science1;
    private Marker science2;
    private Marker science3;
    private Marker art;
    private Marker art1;
    private Marker art2;
    private Marker art3;

    private Button ten;
    private Button twenty;
    private Button thirty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums_price_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        ten = (Button) findViewById(R.id.TenBtn);
        twenty = (Button) findViewById(R.id.TwentyBtn);
        thirty = (Button) findViewById(R.id.ThirtyBtn);

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teneuro(view);
            }
        });

        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twentyeuro(view);
            }
        });

        thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirtyeuro(view);
            }
        });


    }

    public void teneuro(View view){
        art.setVisible(false);
        art1.setVisible(false);
        art2.setVisible(false);
        art3.setVisible(true);
        history.setVisible(false);
        history1.setVisible(true);
        history2.setVisible(false);
        history3.setVisible(false);
        science.setVisible(true);
        science1.setVisible(false);
        science2.setVisible(false);
        science3.setVisible(false);

    }

    public void twentyeuro(View view){
        art.setVisible(true);
        art1.setVisible(true);
        art2.setVisible(false);
        art3.setVisible(false);
        history.setVisible(true);
        history1.setVisible(false);
        history2.setVisible(false);
        history3.setVisible(true);
        science.setVisible(false);
        science1.setVisible(false);
        science2.setVisible(true);
        science3.setVisible(false);
    }

    public void thirtyeuro(View view){
        art.setVisible(false);
        art1.setVisible(false);
        art2.setVisible(true);
        art3.setVisible(false);
        history.setVisible(false);
        history1.setVisible(false);
        history2.setVisible(true);
        history3.setVisible(false);
        science.setVisible(false);
        science1.setVisible(true);
        science2.setVisible(false);
        science3.setVisible(true);
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

        history = mMap.addMarker(new MarkerOptions().position(new LatLng(53.339827, -6.261187)).title("Irish Famine Exhibition").snippet("20 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343732, -6.266646)).title("The Garda Museum").snippet("10 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.354538, -6.264036)).title("Dublin Writers Museum").snippet("30 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348928, -6.247862)).title("EPIC The Irish Emigration Museum").snippet("20 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        art = mMap.addMarker(new MarkerOptions().position(new LatLng(53.347708, -6.245392)).title("“Outside In” Art Gallery and Exhibition Space").snippet("20 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.354236, -6.264636)).title("The Hugh Lane").snippet("20 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.341003, -6.252492)).title("National Gallery").snippet("30 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345384, -6.265439)).title("National Photographic Archive").snippet("10 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        science = mMap.addMarker(new MarkerOptions().position(new LatLng(53.334142, -6.258806)).title("National Children's Science Centre").snippet("10 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344203, -6.250275)).title("Science Gallery Dublin").snippet("30 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343327, -6.252118)).title("Ecological Museum At Trinity College").snippet("20 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344871, -6.264195)).title("Science Gallery International").snippet("30 Euro Entry Fee").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));


    }
}
