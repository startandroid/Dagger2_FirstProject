package ru.startandroid.dagger2_firstproject.storage;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

}
