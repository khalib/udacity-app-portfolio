package com.calebwhang.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the action bar.
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        ArrayList<PortfolioApp> portfolioApps = new ArrayList<PortfolioApp>();

        // Create the list of apps.
        portfolioApps.add(new PortfolioApp(
                "Spotify Streamer",
                "This is a description of the Spotify Streamer App.",
                R.drawable.ic_portfolio_app_green
        ));

        portfolioApps.add(new PortfolioApp(
                "Scores App",
                "This is a description of the Scores App.",
                R.drawable.ic_portfolio_app_orange
        ));

        portfolioApps.add(new PortfolioApp(
                "Library App",
                "This is a description of the Library App.",
                R.drawable.ic_portfolio_app_blue
        ));

        portfolioApps.add(new PortfolioApp(
                "Build It Bigger",
                "This is a description of the Build It Bigger App.",
                R.drawable.ic_portfolio_app_red
        ));

        portfolioApps.add(new PortfolioApp(
                "XYZ Reader",
                "This is a description of the XYZ Reader.",
                R.drawable.ic_portfolio_app_purple
        ));

        portfolioApps.add(new PortfolioApp(
                "Capstone: My Own App",
                "This is a description of the Capstone: My Own App.",
                R.drawable.ic_portfolio_app_yellow
        ));

        mAdapter = new Adapter(portfolioApps);
        mRecyclerView.setAdapter(mAdapter);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void appButtonHandler(View view) {
        Button button = (Button)view;
        Toast.makeText(this, "This button will launch " + button.getText(), Toast.LENGTH_SHORT).show();
    }
}
