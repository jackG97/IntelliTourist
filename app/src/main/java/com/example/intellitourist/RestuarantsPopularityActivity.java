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

public class RestuarantsPopularityActivity extends FragmentActivity implements OnMapReadyCallback {

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
    private Button onestar;
    private Button twostar;
    private Button threestar;
    private Button fourstar;
    private Button fivestar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarants_popularity);



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        onestar = (Button) findViewById(R.id.one);
        twostar = (Button) findViewById(R.id.two);
        threestar = (Button) findViewById(R.id.three);
        fourstar = (Button) findViewById(R.id.four);
        fivestar = (Button) findViewById(R.id.five);

        onestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i();
            }
        });

        twostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ii();
            }
        });

        threestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iii();
            }
        });

        fourstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iiii();
            }
        });

        fivestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iiiii();
            }
        });

    }


    public void i(){
        chinese.setVisible(true);
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
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(false);

    }

    public void ii(){
        chinese.setVisible(false);
        chinese1.setVisible(true);
        chinese2.setVisible(true);
        chinese3.setVisible(false);
        italian.setVisible(false);
        italian1.setVisible(false);
        italian2.setVisible(false);
        fastfood.setVisible(false);
        fastfood1.setVisible(false);
        fastfood2.setVisible(false);
        fastfood3.setVisible(false);
        fastfood4.setVisible(true);
        cafe.setVisible(false);
        cafe1.setVisible(true);
        cafe2.setVisible(false);
        cafe3.setVisible(false);
    }

    public void iii(){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(false);
        italian.setVisible(false);
        italian1.setVisible(false);
        italian2.setVisible(true);
        fastfood.setVisible(false);
        fastfood1.setVisible(true);
        fastfood2.setVisible(false);
        fastfood3.setVisible(false);
        fastfood4.setVisible(false);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(true);
        cafe3.setVisible(false);
    }

    public void iiii(){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(true);
        italian.setVisible(false);
        italian1.setVisible(true);
        italian2.setVisible(false);
        fastfood.setVisible(true);
        fastfood1.setVisible(false);
        fastfood2.setVisible(true);
        fastfood3.setVisible(false);
        fastfood4.setVisible(false);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(false);
    }

    public void iiiii(){
        chinese.setVisible(false);
        chinese1.setVisible(false);
        chinese2.setVisible(false);
        chinese3.setVisible(false);
        italian.setVisible(true);
        italian1.setVisible(false);
        italian2.setVisible(false);
        fastfood.setVisible(false);
        fastfood1.setVisible(false);
        fastfood2.setVisible(false);
        fastfood3.setVisible(true);
        fastfood4.setVisible(false);
        cafe.setVisible(false);
        cafe1.setVisible(false);
        cafe2.setVisible(false);
        cafe3.setVisible(true);
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


        italian = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350476, -6.256562)).title("The Italian Connection Restaurant").snippet("5 of out 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        italian1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.346752, -6.264995)).title("Bar Italia ristorante").snippet("4 of out 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        italian2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.347267, -6.262032)).title("Terra Madre").snippet("3 of out 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        fastfood = mMap.addMarker(new MarkerOptions().position(new LatLng(53.340667, -6.260583)).title("Captain America").snippet("4 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343030, -6.259318)).title("Burger King").snippet("3 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344826, -6.263914)).title("Steakhouse Temple Bar").snippet("4 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.346408, -6.261422)).title("The Hungry Mexican Restaurant").snippet("5 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        fastfood4 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350824, -6.260933)).title("McDonalds").snippet("2 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        chinese = mMap.addMarker(new MarkerOptions().position(new LatLng(53.339036, -6.265793)).title("Bao House").snippet("1 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348212, -6.261673)).title("Dragon Buffet").snippet("2 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343680, -6.264141)).title("Charlies 4").snippet("2 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        chinese3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.343260, -6.260890)).title("Ka Shing Chinese Restaurant").snippet("4 of out 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        cafe = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350667, -6.266212)).title("Cafe Cucina").snippet("1 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe1 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.350246, -6.275863)).title("Cafe Oasis").snippet("2 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe2 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.348744, -6.266743)).title("The Church Café, Late Bar & Restaurant").snippet("3 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        cafe3 = mMap.addMarker(new MarkerOptions().position(new LatLng(53.344490, -6.267424)).title("Cafe Topolis").snippet("5 out of 5").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

    }

}
