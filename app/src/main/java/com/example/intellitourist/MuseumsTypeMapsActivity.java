
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

public class MuseumsTypeMapsActivity extends FragmentActivity implements OnMapReadyCallback {

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

    private Button Art;
    private Button History;
    private Button Science;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums_type_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        Art = (Button) findViewById(R.id.ArtBtn);
        Science = (Button) findViewById(R.id.ScienceBtn);
        History = (Button) findViewById(R.id.HistoryBtn);

        Art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                artview(view);
            }
        });

        Science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scienceview(view);
            }
        });

        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                historyview(view);
            }
        });


    }

    public void artview(View view){
        art.setVisible(true);
        art1.setVisible(true);
        art2.setVisible(true);
        art3.setVisible(true);
        history.setVisible(false);
        history1.setVisible(false);
        history2.setVisible(false);
        history3.setVisible(false);
        science.setVisible(false);
        science1.setVisible(false);
        science2.setVisible(false);
        science3.setVisible(false);

    }

    public void scienceview(View view){
        art.setVisible(false);
        art1.setVisible(false);
        art2.setVisible(false);
        art3.setVisible(false);
        history.setVisible(false);
        history1.setVisible(false);
        history2.setVisible(false);
        history3.setVisible(false);
        science.setVisible(true);
        science1.setVisible(true);
        science2.setVisible(true);
        science3.setVisible(true);
    }

    public void historyview(View view){
        art.setVisible(false);
        art1.setVisible(false);
        art2.setVisible(false);
        art3.setVisible(false);
        history.setVisible(true);
        history1.setVisible(true);
        history2.setVisible(true);
        history3.setVisible(true);
        science.setVisible(false);
        science1.setVisible(false);
        science2.setVisible(false);
        science3.setVisible(false);
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
        history = mMap.addMarker(new MarkerOptions().position(new LatLng(53.339827, -6.261187)).title("Irish Famine Exhibition").snippet("History Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343732, -6.266646)).title("The Garda Museum").snippet("History Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.354538, -6.264036)).title("Dublin Writers Museum").snippet("History Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        history3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348928, -6.247862)).title("EPIC The Irish Emigration Museum").snippet(" History Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        art = mMap.addMarker(new MarkerOptions().position(new LatLng(53.347708, -6.245392)).title("“Outside In” Art Gallery and Exhibition Space").snippet("Art Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.354236, -6.264636)).title("The Hugh Lane").snippet("Art Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.341003, -6.252492)).title("National Gallery").snippet("Art Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        art3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345384, -6.265439)).title("National Photographic Archive").snippet("Art Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        science = mMap.addMarker(new MarkerOptions().position(new LatLng(53.334142, -6.258806)).title("National Children's Science Centre").snippet("Science Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344203, -6.250275)).title("Science Gallery Dublin").snippet("Science Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343327, -6.252118)).title("Ecological Museum At Trinity College").snippet("Science Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        science3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344871, -6.264195)).title("Science Gallery International").snippet("Science Museum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));



    }
}
