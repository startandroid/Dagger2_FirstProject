package ru.startandroid.dagger2_firstproject.app;

import dagger.Component;
import ru.startandroid.dagger2_firstproject.network.NetworkModule;
import ru.startandroid.dagger2_firstproject.network.NetworkUtils;
import ru.startandroid.dagger2_firstproject.storage.DatabaseHelper;
import ru.startandroid.dagger2_firstproject.storage.StorageModule;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
}