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
	
	
/****** Map center ******/
static final LatLng BostonUniversity = new LatLng(42.35105 , -71.10386);

/****** Places that accept convenience points ******/  
static final LatLng WarrenTowers = new LatLng(42.349498, -71.104054);
static final LatLng GSU = new LatLng(42.350563, -71.108935 );
static final LatLng StarBucks = new LatLng(42.348807, -71.095245 );
static final LatLng CityConvenience = new LatLng(42.349100, -71.097002 );
static final LatLng RaisingCanes = new LatLng(42.352026, -71.118753 );
static final LatLng LawSchoolCafe = new LatLng(42.351047, -71.107182 );
static final LatLng StarBucksSMG = new LatLng(42.349616, -71.099537 );

/****** Restaurants ******/
static final LatLng NoodleSt = new LatLng(42.349813,-71.101580 );

static final LatLng Cornwalls = new LatLng(42.349229, -71.095864);
static final LatLng Bertuccis = new LatLng(42.349183, -71.096602);
static final LatLng McDonKenmore = new LatLng(42.348452, -71.096894);
static final LatLng UNOsKen = new LatLng(42.348510, -71.097348);
static final LatLng PopeyesKenm = new LatLng(42.348203, -71.097640);
static final LatLng ScooziKenm = new LatLng(42.348793, -71.099494);
static final LatLng CampusTrolley = new LatLng(42.349898, -71.103247);
static final LatLng InsomniaCookies = new LatLng(42.349524, -71.105407);
static final LatLng BeijingCafe = new LatLng(42.349634, -71.106294);
static final LatLng BostonHouseofPizza = new LatLng (42.350316, -71.113712);
static final LatLng ChipotleWest = new LatLng(42.350720, -71.114704);
static final LatLng PaneraWest = new LatLng (42.350744, -71.115263);
static final LatLng PanRomaWest = new LatLng(42.350996, -71.116859);
static final LatLng SunsetCantinaWest = new LatLng(42.350849, -71.116915);
static final LatLng BurgerfiWest = new LatLng(42.352004, -71.119124);
static final LatLng TsPubWest = new LatLng(42.351996, -71.119704);
static final LatLng VictoriaSeafoodWest = new LatLng(42.352154, -71.121709);
static final LatLng TAnthonysWest = new LatLng(42.351460, -71.121529);
static final LatLng QuansWest = new LatLng(42.351584, -71.121901);
static final LatLng AngoraCafeWest = new LatLng(42.351444, -71.121896);
static final LatLng KayugaWest = new LatLng(42.351551, -71.122110);
static final LatLng BostonPizzaExpress = new LatLng(42.351667, -71.121990);
static final LatLng RoastBeastWest = new LatLng(42.351762, -71.123634);
static final LatLng CookinCafeWest = new LatLng(42.351788, -71.124309);
static final LatLng SarayWest = new LatLng(42.351750, -71.124411);
static final LatLng CrispyCrepesSouth = new LatLng(42.3477692,-71.1059297);
static final LatLng MeiMeiSouth = new LatLng(42.3475508,-71.1059893);
static final LatLng ShabuZenWest = new LatLng(42.3531294,-71.1311793);
static final LatLng KajuTofuWest = new LatLng(42.3530104,-71.1307501);
static final LatLng BonChonWest = new LatLng(42.3530501,-71.1309432);
static final LatLng OttosWest = new LatLng(42.3519638,-71.1181866);
static final LatLng YardHouse = new LatLng(42.345354, -71.100196);
static final LatLng NudPod = new LatLng(42.349832, -71.107247);

/****** Food Trucks ******/
//static final LatLng RhythmWraps = new LatLng(42.349235, -71.100972);
static final LatLng foodtruck_eastcampus_1 = new LatLng(42.349235, -71.100972);
static final LatLng foodtruck_eastcampus_2 = new LatLng(42.348918, -71.104104);
static final LatLng foodtruck_westcampus_1 = new LatLng(42.350925, -71.113191);
static final LatLng foodtruck_westcampus_2 = new LatLng(42.353237, -71.118146);

/****** Coffee Shops ******/
static final LatLng BlueStateCoffeeWest = new LatLng(42.351848, -71.119108);
static final LatLng BrownSugarCafe = new LatLng(42.352279, -71.121848);

/****** Grocery Stores ******/
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

    
     //function to load map. If map is not created it will create it for you
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            
            googleMap.setInfoWindowAdapter(new CustomInfoWindowAdapter()); //  
            //Marker TP = googleMap.addMarker(new MarkerOptions().
            //position(BostonUniversity).title("BostonUniversity"));
            		/******** I took off the marker that marks the center of the map
            		 * that's permanently there because I think
            		 * it looks better that way ********/
            
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }
    
/******************* Location Descriptions ***************/    
    // Replaces the default InfoWindow with the custom one created in custom_info_window.xml
	public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
		
		
		@Override
		public View getInfoContents(Marker marker) {
			
			View infowindow = getLayoutInflater().inflate(R.layout.custom_info_window, null);
			
			// will find and display the location by the title 
			TextView location = (TextView)infowindow.findViewById(R.id.Location);
			location.setText(marker.getTitle());
			
			
		/* There's almost certainly a better way to do this but since I'm a pretty crappy programmer
		 * and I've been learning Java for about two weeks here's how I got around the two line
		 * info window
		 */
			
		/****** Places that Accept Terrier Cards ******/
			
		if (marker.getTitle().equals("Warren Towers"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("627 Commonwealth Ave.\n" + "Boston, MA 02215\n");
				// don't know the dining room schedule
		}
		
		if (marker.getTitle().equals("Geogre Sherman Union"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("775 Commonwealth Ave.\n" + "Boston, MA 02215\n");
				// not sure how we're going to handle all the places here
		}
		
		if (marker.getTitle().equals("StarBucks"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("500 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 425-1941\n" + 
					"Hours: Mon-Sun: 7AM - 9PM\n" + 
					"Accepts Cash, Credit Cards and Convenience Points\n");
		}
		
		if (marker.getTitle().equals("City Convenience"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("543 Commonwealth Ave.\n" + "Boston, MA 02215\n" +"(617) 353-2284\n" + 
					"Hours: Mon-Sun: 6:30AM - 12AM\n" + "Accepts Cash, Credit Cards and Convenience Points\n");
		}
		
		if (marker.getTitle().equals("Raising Canes"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("949 Commonwealth Ave\n" + "Boston, MA 02215\n" +"(617) 358-5932\n" + 
					"Hours: Mon-Sun: 11AM - 12AM, Sat-Sun: 12PM -10:30PM\n" + 
					"Accepts Cash, Credit Cards and Convenience Points\n");
		}
		
		if (marker.getTitle().equals("Law School Cafe"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("765 Commonwealth Ave 2nd Floor\n" + "Boston, MA 02215\n" +"(617) 353-8121\n" + 
					"Hours: Mon-Thu: 8AM - 5:30PM, Fri: 8AM - 2PM\n" + 
					"Accepts Cash, Credit Cards and Convenience Points\n");
		}
		
		if (marker.getTitle().equals("StarBucks @ SMG"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("595 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 353-1524\n" + 
					"Hours: M-F: 7AM -9:30PM, Fri: 7AM - 4PM Sat-Sun: 12PM - 6PM\n" + 
					"Accepts Cash, Credit Cards and Convenience Points\n");
		}
		
		
		/****** Restaurants ******/
		if (marker.getTitle().equals("Noodle Street"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("700 Commonwealth Avenue\n" + "Boston, MA 02215\n" + "(617) 536-3100\n" + 
					"Hours: Mon-Fri: 11:30AM -10:30PM, Sat-Sun: 12PM -10:30PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Cornwalls"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("654 Beacon St.\n" + "Boston, MA 02215\n" + "(617) 262-3749\n" + 
					"Hours: Mon-Sat: 12PM - 2PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Not Avaiable");
		}
		
		if (marker.getTitle().equals("Bertuccis"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("533 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 236-1030\n" + 
					"Hours: Mon-Sat: 11AM - 11PM, Sun: 11AM - 10PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Online Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("McDonalds"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("540 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 867-9524 \n" + 
					"Hours: Mon-Sat: 6AM - 11:45PM, Sun: 7AM - 11:45PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("UNO Chicago Grill"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("645 Beacon St.\n" + "Boston, MA 02215\n" + "(617) 262-4911\n" + 
					"Hours: Mon-Sun: 11AM - 12:30AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Popeyes"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("21 Brookline Ave.\n" + "Boston, MA 02215\n" + "(617) 536-3100\n" + 
					"Hours: Mon-Thu: 10AM - 11PM, Fri-Sat: 10AM - 12AM, Sun: 10AM - 10PM\n" + 
					"Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Scoozi"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("580 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 536-7777\n" + 
					"Hours: Sun-Wed: 10AM - 11PM, Thu-Sat: 10AM - 12AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Campus Trolley"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("665 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 236-7884\n" + 
					"Hours: [Still need to find hours]\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Insomnia Cookies"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("708 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(877) 632-6654\n" + 
					"Hours: Mon-Sun: 11AM - 3AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Take Out(11:AM) and Delivery(Mon-Fri: 4PM, Sat-Sun: 1PM) Available");
		}
		
		if (marker.getTitle().equals("Beijing Cafe"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("728 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 536-1616\n" + 
					"Hours: Mon-Fri: 11AM - 11PM, Sat-Sun: 12PM - 11PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Boston House of Pizza"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("173 Amory St.\n" + "Brookline, MA 02446\n" + "(617) 734-1560\n" + 
					"Hours: Mon-Fri: 11AM - 9PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Chipotle"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("876 Commonwealth Ave.\n" + "Brookline, MA 02215\n" + "(617) 232-1360\n" + 
					"Hours: Mon-Sun: 11:AM - 10PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Panera Bread"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("888 Commonwealth Ave.\n" + "Brookline, MA 02215\n" + "(617) 738-1501\n" + 
					"Hours: Mon-Sat: 6AM - 10PM, Sun: 7AM - 9:30\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Pan Roma Pizza"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1026A Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 734-7777\n" + 
					"Hours: Mon-Sun: 11AM - 2AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Sunset Cantina"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("916 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 731-8646\n" + 
					"Hours: Sun-Wed: 11AM - 1AM, Thu-Sat: 11AM - 2AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		
		if (marker.getTitle().equals("Burgerfi"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("961 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 254-4200\n" + 
					"Hours: Sun-Wed: 11AM - 11PM, Thu-Sat: 11AM - 1AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("T’s Pub"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("973 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 254-0807\n" + 
					"Hours: Mon-Sat: 11AM - 2AM, Sun: 12PM - 12AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Victoria Seafood"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1029 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 783-5111\n" + 
					"Hours: Mon-Sun: 11AM - 1AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("T Anthony’s Pizzeria"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1016 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 734-7708\n" + 
					"Hours: Mon-Thu: 7AM - 1AM, Fri-Sat: 7AM - 2AM, Sun: 8AM - 1AM\n" + 
					"Accepts Cash and Credit Cards\n" + "Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Quan’s Kitchen Chinese Food"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1026 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 232-7617\n" + 
					"Hours: Mon-Sun: 11AM - 2AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Quan’s Kitchen Chinese Food"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1026 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 232-7617\n" + 
					"Hours: Mon-Sun: 11AM - 2AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Angora Cafe"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1024 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 232-1757\n" + 
					"Hours: Mon-Fri: 8AM - 11:30PM, Sat-Sun:  9AM - 11:30PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Kayuga"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1030 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 566-8888\n" + 
					"Hours: Mon-Sun: 3:30PM - 1:30AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Boston Pizza Express"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1026 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 734-7777\n" + 
					"Hours: Sun-Thu: 11AM - 11PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Roast Beast"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1080 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 877-8690\n" + 
					"Hours: Mon: 10AM - 8PM, Tue-Thu: 11AM - 8PM, Fri-Sat: 11AM - 9PM , Sun: 12PM - 5PM\n"
					+ "Accepts Cash and Credit Cards\n" + "Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Cookin Cafe and Grill"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1096 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 566-4144\n" + 
					"Hours: Mon-Sun: 11AM - 11PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Saray Restaurant"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1098 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 383-6651\n" + 
					"Hours: Mon-Sun: 11AM - 11PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Crispy Crepes"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("512 A Park Dr.\n" + "Boston, MA 02215\n" + "(617) 232-7617\n" + 
					"Hours: Mon-Sun: 9AM - 11PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Online Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Mei Mei"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("506 Park Dr.\n" + "Boston, MA 02215\n" + "(857) 250-4959\n" + 
					"Hours: Mon-Sun: 11AM - 10PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Shabu-Zen"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("80 Brighton Ave.\n" + "Allston, MA 02134\n" + "(617) 782-8888\n" + 
					"Hours: Mon-Fri: 11:30am - 11PM, Sat-Sun: 11:30AM - 12AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Not Avaiable");
		}
		
		if (marker.getTitle().equals("Kaju Tofu"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("58 Harvard Ave.\n" + "Boston, MA 02134\n" + "(617) 208-8540\n" + 
					"Hours: Mon-Sun: 10AM - 10PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery Avaiable");
		}
		
		if (marker.getTitle().equals("BonChon Chicken"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("123 Brighton Ave #300\n" + "Allston, MA 02134\n" + "(617) 254-8888\n" + 
					"Hours: Mon-Sun: 11:45am - 12PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Otto Pizza"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("80 Brighton Ave.\n" + "Brookline, MA 02446\n" + "(617) 232-0447\n" + 
					"Hours: Mon-Sun: 11AM - 10PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delievery and Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Yard House"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("126 Brookline Ave.\n" + "Boston, MA 02215\n" + "(617) 236-4083\n" + 
					"Hours: Sun-Thur: 11AM - 12AM, Fri-Sat 11AM - 1AM\n" + "Accepts Cash and Credit Cards\n" + 
					"Takeout Avaiable");
		}
		
		if (marker.getTitle().equals("Nud Pob Thai Cuisine"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("738 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 232-9992\n" + 
					"Hours: Mon-Sun: 11:30AM - 10:30PM\n" + "Accepts Cash and Credit Cards\n" + 
					"Delivery And Takeout Avaiable");
		}
		
		/****** Food Trucks ******/
		if (marker.getTitle().equals("Morse Auditorium Food Truck"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("602 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "\n" + "Lunch: 11AM- 3PM\n" + 
					"Mon-Tue: Rythmn Wraps\n" + "Wed: The Dining Car\n" + "Thu: Mei Mei's Kitchen\n" +
					"The Dining Car\n" + "\n" + "Dinner: 3PM - 7:30PM\n" + "Mon-Thur: Bon Mei\n" +
					"Fri: Frozen Hoaggies\n" + "\n" + "Accepts Cash and Credit Cards");
		}
		
		/****** Coffee Shops ******/
		if (marker.getTitle().equals("Blue State Coffee")) // no marker yet
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("957 Commonwealth Ave.\n" + "Boston, MA 02215\n" + "(617) 254-0929\n" + 
					"Hours: Mon-Fri: 7AM - 8PM, Sat-Sun: 8AM - 8PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		/****** Grocery Stores ******/
		if (marker.getTitle().equals("Shaws"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1065 Commonwealth Ave\n" + "Boston, MA 02215\n" +"(617) 783-5878\n" + 
					"Hours: 24/7\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Hong Kong Supermarket"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1095 Commonwealth Ave\n" + "Boston, MA 02215\n" + "(617) 787-2288\n" + 
					"Hours: Mon-Sun: 9AM - 9PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Supermarket 88"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1 Brighton Ave\n" + "Boston, MA 02134\n" + "(617) 787-2288\n" + 
					"Hours: Mon-Sun: 9AM - 10:30PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Turkuaz Market"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("16 Brighton Ave\n" + "Allston, MA 02134\n" + "(617) 202-6125\n" + 
					"Hours: Mon-Fri:11:30 AM -10:30 PM, Sat-Sun:12 PM -10:30 PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		if (marker.getTitle().equals("Whole Foods"))
		{
			TextView information = (TextView)infowindow.findViewById(R.id.Information);
			information.setText("1026-1028 Beacon St\n" + "Brookline, MA 02446\n" + "(617) 202-0550\n" + 
					"Hours: Mon-Sun: 8AM – 10PM\n" + "Accepts Cash and Credit Cards\n");
		}
		
		
		
			return infowindow;
		}

		@Override
		public View getInfoWindow(Marker marker) {	
			return null;
		}
	}
/******************* End of Location descriptions ***************/  
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.BU:
             {
             
                return true;}
            case R.id.ds:
             { googleMap.clear();
              //Marker TP = googleMap.addMarker(new MarkerOptions().
                         //position(BostonUniversity).title("BostonUniversity"));
              
             Marker T0 = googleMap.addMarker(new MarkerOptions()
             			.position(WarrenTowers)
                        .title("Warren Towers")
                        .snippet("Open M-F 7 am - 9 pm  ... 700 Commonwealth Ave")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             		
             Marker T1 = googleMap.addMarker(new MarkerOptions().
                     position(GSU).title("Geogre Sherman Union").
                     snippet("775 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T2 = googleMap.addMarker(new MarkerOptions().
                     position(StarBucks).title("StarBucks").
                     snippet("Open M-S 7 am - 9 pm  ... 500 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T3 = googleMap.addMarker(new MarkerOptions().
                     position(CityConvenience).title("City Convenience").
                     snippet("Open M-S 7 am - 2 am  ... 543 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T4 = googleMap.addMarker(new MarkerOptions().
                     position(RaisingCanes).title("Raising Canes").
                     snippet("Open M-S 11 am - 12 am  ... 949 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T5 = googleMap.addMarker(new MarkerOptions().
                     position(LawSchoolCafe).title("Law School Cafe").
                     snippet("Open M-R 8 am - 5 pm ... F 8 am - 2 pm ... 765 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             Marker T6 = googleMap.addMarker(new MarkerOptions().
                     position(StarBucksSMG).title("StarBucks @ SMG").
                     snippet("Open M-R 7 am - 4 pm ... weekend 12 pm - 6 pm ... 543 Commonwealth Ave").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.bu_marker)));
             return true;}
             
            case R.id.rs:
             {googleMap.clear();
              //Marker TP = googleMap.addMarker(new MarkerOptions().
                         //position(BostonUniversity).title("BostonUniversity"));
             Marker R1 = googleMap.addMarker(new MarkerOptions().
                     position(NoodleSt).title("Noodle Street").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R2 = googleMap.addMarker(new MarkerOptions().
                     position(Cornwalls).title("Cornwalls").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R3 = googleMap.addMarker(new MarkerOptions().
                     position(Bertuccis).title("Bertuccis").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R4 = googleMap.addMarker(new MarkerOptions().
                     position(McDonKenmore).title("McDonalds").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R5 = googleMap.addMarker(new MarkerOptions().
                     position(UNOsKen).title("UNO Chicago Grill").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R6 = googleMap.addMarker(new MarkerOptions().
                     position(PopeyesKenm).title("Popeyes").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R7 = googleMap.addMarker(new MarkerOptions().
                     position(ScooziKenm).title("Scoozi").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R8 = googleMap.addMarker(new MarkerOptions().
                     position(CampusTrolley).title("Campus Trolley").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R9 = googleMap.addMarker(new MarkerOptions().
                     position(InsomniaCookies).title("Insomnia Cookies").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R10 = googleMap.addMarker(new MarkerOptions().
                     position(BeijingCafe).title("Beijing Cafe").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R11 = googleMap.addMarker(new MarkerOptions().
                     position(BostonHouseofPizza).title("Boston House of Pizza").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R12 = googleMap.addMarker(new MarkerOptions().
                     position(ChipotleWest).title("Chipotle").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R13 = googleMap.addMarker(new MarkerOptions().
                     position(PaneraWest).title("Panera Bread").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R14 = googleMap.addMarker(new MarkerOptions().
                     position(PanRomaWest).title("Pan Roma Pizza").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R15 = googleMap.addMarker(new MarkerOptions().
                     position(SunsetCantinaWest).title("Sunset Cantina").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R16 = googleMap.addMarker(new MarkerOptions().
                     position(BurgerfiWest).title("Burgerfi").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R17 = googleMap.addMarker(new MarkerOptions().
                     position(TsPubWest).title("T’s Pub").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R18 = googleMap.addMarker(new MarkerOptions().
                     position(VictoriaSeafoodWest).title("Victoria Seafood").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R19 = googleMap.addMarker(new MarkerOptions().
                     position(TAnthonysWest).title("T Anthony’s Pizzeria").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R20 = googleMap.addMarker(new MarkerOptions().
                     position(QuansWest).title("Quan’s Kitchen Chinese Food").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R21 = googleMap.addMarker(new MarkerOptions().
                     position(AngoraCafeWest).title("Angora Cafe").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R22 = googleMap.addMarker(new MarkerOptions().
                     position(KayugaWest).title("Kayuga").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R23 = googleMap.addMarker(new MarkerOptions().
                     position(BostonPizzaExpress).title("Boston Pizza Express").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R24 = googleMap.addMarker(new MarkerOptions().
                     position(RoastBeastWest).title("Roast Beast").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R25 = googleMap.addMarker(new MarkerOptions().
                     position(CookinCafeWest).title("Cookin Cafe and Grill").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R26 = googleMap.addMarker(new MarkerOptions().
                     position(SarayWest).title("Saray Restaurant").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R27 = googleMap.addMarker(new MarkerOptions().
                     position(CrispyCrepesSouth).title("Crispy Crepes").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R28 = googleMap.addMarker(new MarkerOptions().
                     position(MeiMeiSouth).title("Mei Mei").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R29 = googleMap.addMarker(new MarkerOptions().
                     position(ShabuZenWest).title("Shabu-Zen").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R30 = googleMap.addMarker(new MarkerOptions().
                     position(BonChonWest).title("BonChon Chicken").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R31 = googleMap.addMarker(new MarkerOptions().
                     position(KajuTofuWest).title("Kaju Tofu").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R32 = googleMap.addMarker(new MarkerOptions().
                     position(OttosWest).title("Otto Pizza").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R33 = googleMap.addMarker(new MarkerOptions().
                     position(YardHouse).title("Yard House").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             Marker R34 = googleMap.addMarker(new MarkerOptions().
                     position(NudPod).title("Nud Pob Thai Cuisine").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.restaurant_marker)));
             
                return true; }
            case R.id.fs:
             {googleMap.clear();
              //Marker TP = googleMap.addMarker(new MarkerOptions().
                         //position(BostonUniversity).title("BostonUniversity"));
             //Marker T10 = googleMap.addMarker(new MarkerOptions().
                        //position(RhythmWraps).title("RhythmWraps"));
             
             Marker FT1 = googleMap.addMarker(new MarkerOptions().
                     position(foodtruck_eastcampus_1).title("Morse Auditorium Food Truck").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.truck_marker)));
             Marker FT2 = googleMap.addMarker(new MarkerOptions().
                     position(foodtruck_eastcampus_2).title("Cummington Street Food Truck ").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.truck_marker)));
             Marker FT3 = googleMap.addMarker(new MarkerOptions().
                     position(foodtruck_westcampus_1).title("West Campus Food Truck").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.truck_marker)));
             Marker FT5 = googleMap.addMarker(new MarkerOptions().
                     position(foodtruck_westcampus_2).title("Agganis Way Food Truck").
                     icon(BitmapDescriptorFactory.fromResource(R.drawable.truck_marker)));
             
                return true; }
            case R.id.gy:
            {
            	googleMap.clear();
             //Marker TP = googleMap.addMarker(new MarkerOptions().
                        //position(BostonUniversity).title("BostonUniversity"));
            Marker G1 = googleMap.addMarker(new MarkerOptions().
                       position(ShawsWest).title("Shaws").
                       snippet("Open 24/7 ... 1065 Commonwealth Ave").
                       icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker G2 = googleMap.addMarker(new MarkerOptions().
                    position(HongKong).title("Hong Kong Supermarket").
                    snippet("M-S 9 am - 9 pm ... 1095 Commonwealth Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker G3 = googleMap.addMarker(new MarkerOptions().
                    position(Supermarket88).title("Supermarket 88").
                    snippet("M-S 9 am - 10:30 pm ... 1 Brighton Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker G4 = googleMap.addMarker(new MarkerOptions().
                    position(TurkuazMarket).title("Turkuaz Market").
                    snippet("M-Sa 9 am - 9 pm ... S 10 am - 8 pm ... 16 Brighton Ave").
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.grocery_marker)));
            Marker G5 = googleMap.addMarker(new MarkerOptions().
                    position(WholeFoodsSouth).title("Whole Foods").
                    snippet("8 am - 10 pm ... 1026-1028 Beacon st, Brookline").
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

