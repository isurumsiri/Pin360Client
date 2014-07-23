package dev.pin.pin360;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String address = intent.getStringExtra(Intent.EXTRA_SUBJECT);
        String city = intent.getStringExtra(Intent.EXTRA_SUBJECT);

        TextView textViewAddress = (TextView) findViewById(R.id.txtAddress);
        TextView textViewCity = (TextView) findViewById(R.id.txtCity);
        textViewAddress.setText(address);
        textViewCity.setText(city);

        TextView textViewEvent1 = (TextView) findViewById(R.id.txtEvent1);
        TextView textViewEvent2 = (TextView) findViewById(R.id.txtEvent2);
        TextView textViewEvent3 = (TextView) findViewById(R.id.txtEvent3);

        textViewEvent1.setText("NSBM Commounity Event");
        textViewEvent2.setText("UCD CS Welcome Party");
        textViewEvent3.setText("CS Society Event");

//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_home, container, false);
            return rootView;
        }
    }

}
