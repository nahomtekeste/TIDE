package com.example.timeractivity

import android.os.Bundle
import android.preference.PreferenceFragment



class SettingsActivityFragment : PreferenceFragment() {
    fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}