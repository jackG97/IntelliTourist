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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    private Marker barsMarkers;
    private Marker barsMarkers1;
    private Marker barsMarkers2;
    private Marker nightclubsMarkers;
    private Marker nightclubsMarkers1;
    private Marker nightclubsMarkers2;
    private Marker nightclubsMarkers3;
    private Button Nbutton;
    private Button Bbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Nbutton = (Button) findViewById(R.id.nightclubsbtn);
        Bbutton = (Button) findViewById(R.id.barsbtn);


        Nbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nightclubs(view);
            }
        });



        Bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bars(view);
            }
        });


    }


    public void nightclubs(View view){
            nightclubsMarkers.setVisible(true);
            nightclubsMarkers1.setVisible(true);
            nightclubsMarkers2.setVisible(true);
            nightclubsMarkers3.setVisible(true);
            barsMarkers.setVisible(false);
            barsMarkers1.setVisible(false);
            barsMarkers2.setVisible(false);
        }




    public void bars(View view){
            barsMarkers.setVisible(true);
            barsMarkers1.setVisible(true);
            barsMarkers2.setVisible(true);
            nightclubsMarkers.setVisible(false);
            nightclubsMarkers1.setVisible(false);
            nightclubsMarkers2.setVisible(false);
            nightclubsMarkers3.setVisible(false);

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
        nightclubsMarkers = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335494, -6.263579)).title("Copper Face Jacks").snippet("Nightclub").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.335942, -6.263552)).title("Dicey's Garden Club").snippet("Nightclub").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348158, -6.261998)).title("The Academy").snippet("Nightclub").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        nightclubsMarkers3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.347076, -6.254171)).title("O'Reilly's").snippet("Nightclub").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));



        barsMarkers = mMap.addMarker(new MarkerOptions().position(new LatLng(53.336163, -6.265102)).title("Flannery's Bar").snippet("Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.345139, -6.265858)).title("Bab Bobs").snippet("Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        barsMarkers2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348158, -6.261998)).title("River Bar").snippet("Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));


    }
}
