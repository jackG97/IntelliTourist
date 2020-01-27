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

public class RestuarantsMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    SupportMapFragment mapFragment;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        searchView = findViewById(R.id.sv_location);
        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.google_map);

        searchView.setOnQueryTextListener((new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String location = searchView.getQuery().toString();
                List<Address> addresslist  = null;


                if (location != null || !location.equals("")){
                    Geocoder geocoder = new Geocoder(RestuarantsMapActivity.this);
                    try{
                        addresslist = geocoder.getFromLocationName(location, 1);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    Address address = addresslist.get(0);
                    LatLng latLng = new LatLng(address.getLatitude(),address.getLongitude());
                    mMap.addMarker(new MarkerOptions().position(latLng).title(location));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10));

                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        }));

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
        LatLng dublin = new LatLng(53.340667, -6.260583);
        mMap.addMarker(new MarkerOptions().position(dublin).title("Captain America").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin));

        LatLng dublin1 = new LatLng(53.344826, -6.263914);
        mMap.addMarker(new MarkerOptions().position(dublin1).title("Steakhouse Temple Bar").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin1));

        LatLng dublin2 = new LatLng(53.346408, -6.261422);
        mMap.addMarker(new MarkerOptions().position(dublin2).title("The Hungry Mexican Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin2));

        LatLng dublin3 = new LatLng(53.348547, -6.260768);
        mMap.addMarker(new MarkerOptions().position(dublin3).title("Govinda's Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin3));

        LatLng dublin4 = new LatLng(53.350476, -6.256562);
        mMap.addMarker(new MarkerOptions().position(dublin4).title("The Italian Connection Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin4));

        LatLng dublin5 = new LatLng(53.346752, -6.264995);
        mMap.addMarker(new MarkerOptions().position(dublin5).title("Bar Italia ristorante").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin5));

        LatLng dublin6 = new LatLng(53.348821, -6.266690);
        mMap.addMarker(new MarkerOptions().position(dublin6).title("The Church Café, Late Bar & Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin6));

        LatLng dublin7 = new LatLng(53.340636, -6.258257);
        mMap.addMarker(new MarkerOptions().position(dublin7).title("Fire Restaurant Dublin").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin7));

        LatLng dublin8 = new LatLng(53.345609, -6.254502);
        mMap.addMarker(new MarkerOptions().position(dublin8).title("Courtyard Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin8));

        LatLng dublin9 = new LatLng(53.341282, -6.257334);
        mMap.addMarker(new MarkerOptions().position(dublin9).title("One Pico Restaurant").snippet("Restuarant")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dublin9));




    }
}
