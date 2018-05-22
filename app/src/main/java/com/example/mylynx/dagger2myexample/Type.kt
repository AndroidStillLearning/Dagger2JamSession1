package com.example.mylynx.dagger2myexample

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by mylynx on 22.05.18.
 */
class Type  {

    var material: String

    @Inject  constructor(@Named("first_material") material: String) {
        this.material = material
    }
}