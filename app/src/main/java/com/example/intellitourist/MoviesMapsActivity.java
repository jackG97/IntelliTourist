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

public class MoviesMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_maps);
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
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.351404, -6.260463)).title("Savoy Cinema").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.350323, -6.267670)).title("Cineworld Cinema Dublin").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.348893, -6.279052)).title("Light House Cinema").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.341744, -6.263655)).title("Brooks Private Cinema").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.348617, -6.227716)).title("ODEON Point Square").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.344736, -6.264889)).title("Irish Film Institute").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.324073, -6.265295)).title("Omniplex Cinema Rathmines").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.322644, -6.265756)).title("The Stella Cinema Rathmines").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(53.288526, -6.242237)).title("Movies @ Dundrum").snippet("Cinema").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

    }
}
