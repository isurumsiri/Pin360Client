package dev.pin.pin360;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Locale;

public class MainActivity extends ActionBarActivity {

    static Double lat;
    static Double log;
    Pin360LocationListner pin360LocationListner;
    LocationManager locationManager;
    Geocoder geocoder;
    List<Address> addresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        pin360LocationListner = new Pin360LocationListner();

        geocoder = new Geocoder(this, Locale.getDefault());
//        try {
//            addresses = (List<Address>) geocoder.getFromLocation(lat,log,1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String address = addresses.get(0).getAddressLine(0);
//        String city = address = addresses.get(0).getAddressLine(1);
        String address = "Homagama";
        String city = "Colombo";

        Intent initIntent = new Intent(this, HomeActivity.class);
        initIntent.putExtra(Intent.EXTRA_SUBJECT,address);
        initIntent.putExtra(Intent.EXTRA_TEXT,city);

        startActivity(initIntent);

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    public static class Pin360LocationListner implements LocationListener{

        @Override
        public void onLocationChanged(Location location) {
            lat = location.getLatitude();
            log = location.getLongitude();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }

}
