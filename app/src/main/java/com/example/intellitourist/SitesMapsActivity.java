package com.example.intellitourist;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SitesMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng dublin = new LatLng(53.344504, -6.259229);
        mMap.addMarker(new MarkerOptions().position(dublin).title("Trinity College").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin));

        LatLng dublin1 = new LatLng(53.343060, -6.267490);
        mMap.addMarker(new MarkerOptions().position(dublin1).title("Dublin Castle").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin1));

        LatLng dublin2 = new LatLng(53.343739, -6.270687);
        mMap.addMarker(new MarkerOptions().position(dublin2).title("Christ Church Cathedral").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin2));

        LatLng dublin3 = new LatLng(53.342453, -6.286724);
        mMap.addMarker(new MarkerOptions().position(dublin3).title("Guinness Storehouse").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin3));

        LatLng dublin4 = new LatLng(53.348567, -6.277326);
        mMap.addMarker(new MarkerOptions().position(dublin4).title("Jameson Distillery Bow St.").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin4));

        LatLng dublin5 = new LatLng(53.346537, -6.263089);
        mMap.addMarker(new MarkerOptions().position(dublin5).title("Ha'penny Bridge").snippet("Famous Site")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin5));








    }
}
