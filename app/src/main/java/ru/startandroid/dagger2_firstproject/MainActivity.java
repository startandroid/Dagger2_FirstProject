package ru.startandroid.dagger2_firstproject;

import android.app.Activity;
import android.os.Bundle;

import ru.startandroid.dagger2_firstproject.app.App;
import ru.startandroid.dagger2_firstproject.storage.DatabaseHelper;
import ru.startandroid.dagger2_firstproject.network.NetworkUtils;

public class MainActivity extends Activity {

    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = App.getComponent().getDatabaseHelper();
        networkUtils = App.getComponent().getNetworkUtils();
    }
}
