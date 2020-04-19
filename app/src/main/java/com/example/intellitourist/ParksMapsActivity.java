package com.example.intellitourist;

import androidx.fragment.app.FragmentActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.SearchView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class ParksMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        // SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
        //      .findFragmentById(R.id.map);
        // mapFragment.getMapAsync(this);
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
        LatLng dublin = new LatLng(53.355754, -6.328356);
        mMap.addMarker(new MarkerOptions().position(dublin).title("Phoenix Park").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin));

        LatLng dublin1 = new LatLng(53.339594, -6.260479);
        mMap.addMarker(new MarkerOptions().position(dublin1).title("St Stephens Green Park").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin1));

        LatLng dublin2 = new LatLng(53.303103, -6.293651);
        mMap.addMarker(new MarkerOptions().position(dublin2).title("Bushy Park Road").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin2));

        LatLng dublin3 = new LatLng(53.273209, -6.269357);
        mMap.addMarker(new MarkerOptions().position(dublin3).title("Marlay Park").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin3));

        LatLng dublin4 = new LatLng(53.343383, -6.254574);
        mMap.addMarker(new MarkerOptions().position(dublin4).title("College Park").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin4));

        LatLng dublin5 = new LatLng(53.356718, -6.257507);
        mMap.addMarker(new MarkerOptions().position(dublin5).title("Mountjoy Square Park").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin5));

        LatLng dublin6 = new LatLng(53.353981, -6.264118);
        mMap.addMarker(new MarkerOptions().position(dublin6).title("Garden of Remembrance").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin6));

        LatLng dublin7 = new LatLng(53.339873, -6.249192);
        mMap.addMarker(new MarkerOptions().position(dublin7).title("Merrion Square").snippet("Park")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin7));



    }
}
