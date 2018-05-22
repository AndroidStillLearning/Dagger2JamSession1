package com.example.mylynx.dagger2myexample


import dagger.Component

/**
 * Created by mylynx on 22.05.18.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun getType(): Type
    fun getBuildingName(): Building

}