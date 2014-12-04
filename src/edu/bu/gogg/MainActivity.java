package edu.bu.gogg;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import edu.bu.gogg.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import android.widget.Toast;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewGroup;
public class MainActivity extends Activity {
  
    // Google Map
static final LatLng BostonUniversity = new LatLng(42.35105 , -71.10386);
static final LatLng WarrenTowers = new LatLng(42.349498, -71.104054);
static final LatLng NoodleSt = new LatLng(42.349813,-71.101580 );
static final LatLng RhythmWraps = new LatLng(42.345948, -71.107426 );
static final LatLng GSU = new LatLng(42.350563, -71.108935 );
static final LatLng StarBucks = new LatLng(42.348807, -71.095245 );
static final LatLng CityConvenience = new LatLng(42.349100, -71.097002 );
static final LatLng RaisingCanes = new LatLng(42.352026, -71.118753 );
static final LatLng LawSchoolCafe = new LatLng(42.351047, -71.107182 );
static final LatLng StarBucksSMG = new LatLng(42.349616, -71.099537 );
static final LatLng ShawsWest = new LatLng(42.352697, -71.123563 );
static final LatLng HongKong = new LatLng(42.352660, -71.125496 );
static final LatLng Supermarket88 = new LatLng(42.352439, -71.125400 );
static final LatLng TurkuazMarket = new LatLng(42.352261, -71.126413 );
static final LatLng WholeFoodsSouth = new LatLng(42.345897,-71.108193 );

    private GoogleMap googleMap;
    private GoogleMap map;
    private final String TAG = "MainActivity";
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
     getMenuInflater().inflate(R.menu.main,menu);
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
            case R.id.ds:
             { googleMap.clear();
              Marker TP = googleMap.addMarker(new MarkerOptions().
                         position(BostonUniversity).title("Boston University"));
              
             Marker T0 = googleMap.addMarker(new MarkerOptions().
                        position(WarrenTowers).title("Warren Towers").
                        snippet("Open M-F 7 am - 9 pm  | 700 Commonwealth Ave").
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T1 = googleMap.addMarker(new MarkerOptions().
                     position(GSU).title("GSU").
                     snippet("775 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T2 = googleMap.addMarker(new MarkerOptions().
                     position(StarBucks).title("Starbucks").
                     snippet("Open M-S 7 am - 9 pm  | 500 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T3 = googleMap.addMarker(new MarkerOptions().
                     position(CityConvenience).title("City Convenience").
                     snippet("Open M-S 7 am - 2 am  | 543 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T4 = googleMap.addMarker(new MarkerOptions().
                     position(RaisingCanes).title("Raising Canes").
                     snippet("Open M-S 11 am - 12 am  | 949 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T5 = googleMap.addMarker(new MarkerOptions().
                     position(LawSchoolCafe).title("Law School Cafe").
                     snippet("Open M-R 8 am - 5 pm | F 8 am - 2 pm | 765 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T6 = googleMap.addMarker(new MarkerOptions().
                     position(StarBucksSMG).title("Starbucks @ SMG").
                     snippet("Open M-R 7 am - 4 pm | weekend 12 pm - 6 pm | 543 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             return true;}
            case R.id.rs:
             {googleMap.clear();
              Marker TP = googleMap.addMarker(new MarkerOptions().
                         position(BostonUniversity).title("BostonUniversity"));
             Marker T7 = googleMap.addMarker(new MarkerOptions().
                        position(NoodleSt).title("NoodleSt").
                        snippet("M-R 11:30 am - 10:30 pm | F-Sa 11:30 am - 11 pm | S 12 pm - 10:30 pm | 627 Commonwealth Ave").
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.dinein_marker)));
             
                return true; }
            case R.id.fs:
             {googleMap.clear();
              Marker TP = googleMap.addMarker(new MarkerOptions().
                         position(BostonUniversity).title("BostonUniversity"));
             Marker T10 = googleMap.addMarker(new MarkerOptions().
                        position(RhythmWraps).title("RhythmWraps"));
             
                return true; }
            case R.id.gy:
            {
            	googleMap.clear();
             Marker TP = googleMap.addMarker(new MarkerOptions().
                        position(BostonUniversity).title("BostonUniversity"));
            Marker T8 = googleMap.addMarker(new MarkerOptions().
                       position(ShawsWest).title("ShawsWest").
                       snippet("Open 24/7 | 1065 Commonwealth Ave").
                       icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker T9 = googleMap.addMarker(new MarkerOptions().
                    position(HongKong).title("HongKong").
                    snippet("M-S 9 am - 9 pm | 1095 Commonwealth Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker Ta = googleMap.addMarker(new MarkerOptions().
                    position(Supermarket88).title("Supermarket 88").
                    snippet("M-S 9 am - 10:30 pm | 1 Brighton Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker Tb = googleMap.addMarker(new MarkerOptions().
                    position(TurkuazMarket).title("Turkuaz Market").
                    snippet("M-Sa 9 am - 9 pm | S 10 am - 8 pm | 16 Brighton Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker Tc = googleMap.addMarker(new MarkerOptions().
                    position(WholeFoodsSouth).title("Whole Foods South").
                    snippet("8 am - 10 pm | 1026-1028 Beacon st, Brookline").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
         
               return true; } 
            case R.id.ls:
               googleMap = null;
               
               LayoutInflater inflater = getLayoutInflater();
               View view = inflater.inflate(R.layout.cust_toast_layout,
                                              (ViewGroup) findViewById(R.id.relativeLayout1));

               Toast toast = new Toast(this);
               toast.setView(view);
              
               toast.show();
              // Toast.makeText(getApplicationContext(),
            		//   setView(view) , Toast.LENGTH_LONG)
                  //       .show();
                return true; 
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private CharSequence setView(View view) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
  //  public void onStart()
  //  {
   //  super.onStart();
   //  Log.i(TAG,"OnStart");
  //  }
  //  @Override
  //  protected void onResume() {
    //    super.onResume();
      //  initilizeMap();
       // Log.i(TAG,"onResume");
       
   // }
   // @Override
    public void onPause()
    {
     super.onPause();
     Log.i(TAG,"onPause");
    }
 
}