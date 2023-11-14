package com.bignerdranch.android.week8

import android.app.Application


class CriminalIntentApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}