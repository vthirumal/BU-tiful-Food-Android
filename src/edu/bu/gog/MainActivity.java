package edu.bu.gog;

import com.google.android.gms.maps.GoogleMap;

import edu.bu.gog.R;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;


import android.app.Activity;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import android.util.Log;
import android.view.Menu;

import android.widget.TextView;
import android.widget.Toast;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public class MainActivity extends Activity {
	 
    // Google Map
static final LatLng BostonUniversity = new LatLng(42.35105 , -71.10386);
static final LatLng WarrenTowers = new LatLng(42.349498, -71.104054);
static final LatLng NoodleSt = new LatLng(42.349813,-71.101580 );
static final LatLng RhythmWraps = new LatLng(42.345948, -71.107426 );
    private GoogleMap googleMap;
    private GoogleMap map;
    private final String TAG = "MainActivity";
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {getMenuInflater().inflate(R.menu.main,menu);
	
     
     return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate");
        
     
    
    
        try {
            // Loading map
            initilizeMap();
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BostonUniversity, 15));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
 
    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            Marker TP = googleMap.addMarker(new MarkerOptions().
            position(BostonUniversity).title("BostonUniversity"));
            
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
    	

        switch (item.getItemId()) {
            case R.id.BU:
            	{
            	
                return true;}
            case R.id.dininghalls:
            	{ googleMap.clear();
            	 Marker TP = googleMap.addMarker(new MarkerOptions().
            	            position(BostonUniversity).title("BostonUniversity"));
            	Marker T = googleMap.addMarker(new MarkerOptions().
                        position(WarrenTowers).title("WarrenTowers"));
            	
                return true;}
            case R.id.restaurants:
            	{googleMap.clear();
            	 Marker TP = googleMap.addMarker(new MarkerOptions().
            	            position(BostonUniversity).title("BostonUniversity"));
            	Marker T1 = googleMap.addMarker(new MarkerOptions().
                        position(NoodleSt).title("NoodleSt"));
            	
                return true; }
            case R.id.foodtrucks:
            	{googleMap.clear();
            	 Marker TP = googleMap.addMarker(new MarkerOptions().
            	            position(BostonUniversity).title("BostonUniversity"));
            	Marker T2 = googleMap.addMarker(new MarkerOptions().
                        position(RhythmWraps).title("RhythmWraps"));
            	
                return true; }
            case R.id.legends:
            	  
            	  
            	  Toast.makeText(getApplicationContext(),
                          "Legends", Toast.LENGTH_LONG)
                          .show();
                return true; 
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onStart()
    {
   	 super.onStart();
   	 Log.i(TAG,"OnStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        initilizeMap();
        Log.i(TAG,"onResume");
       
    }
    @Override
    public void onPause()
    {
    	super.onPause();
    	Log.i(TAG,"onPause");
    }
 
}
