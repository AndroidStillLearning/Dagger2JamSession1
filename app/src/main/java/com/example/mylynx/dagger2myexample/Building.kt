package com.example.mylynx.dagger2myexample

import android.util.Log
import javax.inject.Inject

/**
 * Created by mylynx on 22.05.18.
 */
class Building {

    var type: Type

    @Inject
    constructor(type: Type) {
        this.type = type
        Log.d("message", "Building is made of " + type.material)
    }
}