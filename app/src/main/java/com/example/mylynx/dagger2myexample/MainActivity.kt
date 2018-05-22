package com.example.mylynx.dagger2myexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



     //   Building(Type("Wood"))

        val component: ApplicationComponent = DaggerApplicationComponent.create()
        component.getBuildingName()
    }
}
