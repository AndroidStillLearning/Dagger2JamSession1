package com.example.mylynx.dagger2myexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by mylynx on 22.05.18.
 */
@Module
class ApplicationModule {

    @Provides
    @Named("first_material")
    fun provideMaterial1(): String {
        return "Stone"
    }

    @Provides
    @Named("second_material")
    fun provideMaterial2(): String {
        return "Glass"
    }

}