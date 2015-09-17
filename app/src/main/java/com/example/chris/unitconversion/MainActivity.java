package com.example.chris.unitconversion;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.chris.unitconversion.data.DrawerItemCustomAdapter;
import com.example.chris.unitconversion.data.UnitType;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private List<UnitType> mDrawerItems;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerItemTitles = getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mToolBar = (Toolbar) findViewById(R.id.action_bar);

        mToolBar.setNavigationIcon(R.drawable.ic_drawer);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setIcon(R.drawable.ic_drawer);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolBar,
                R.string.drawer_open,
                R.string.drawer_closed
        ) {
            public void onDrawerClosed(View view) {

            }
            public void onDrawerOpened(View view){

            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerItems = new ArrayList<>();

        mDrawerItems.add(UnitType.Pressure);
        mDrawerItems.add(UnitType.Area);
        mDrawerItems.add(UnitType.Energy);
        mDrawerItems.add(UnitType.Length);
        mDrawerItems.add(UnitType.Angle);
        mDrawerItems.add(UnitType.Acceleration);
        mDrawerItems.add(UnitType.Density);
        mDrawerItems.add(UnitType.DigitalInformation);
        mDrawerItems.add(UnitType.Force);
        mDrawerItems.add(UnitType.Power);
        mDrawerItems.add(UnitType.Speed);
        mDrawerItems.add(UnitType.Temperature);
        mDrawerItems.add(UnitType.Torque);
        mDrawerItems.add(UnitType.Time);
        mDrawerItems.add(UnitType.Volume);

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.listview_item_row, mDrawerItems);
        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(this);

        setUnitConversionFragment(UnitType.Pressure);

    }

    private void setUnitConversionFragment(final UnitType unitType)
    {
        UnitConversionFragment fragment = UnitConversionFragment.newInstance(unitType);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commitAllowingStateLoss();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*AdapterView.OnItemClickListener*/
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("changed", "" + position);
        UnitType currentUnitSelected = mDrawerItems.get(position);
        setUnitConversionFragment(currentUnitSelected);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }
}
