package com.vncmsk.puntosdeinteres.ui.preference

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.preference.PreferenceFragmentCompat
import com.vncmsk.puntosdeinteres.R
import com.vncmsk.puntosdeinteres.ui.main.MainActivity

class SettingsFragment : PreferenceFragmentCompat() {

  override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
    setPreferencesFromResource(R.xml.root_preferences, rootKey)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setHasOptionsMenu(true)
    (activity as MainActivity?)?.showIcon()
  }

  override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    super.onCreateOptionsMenu(menu, inflater)
    menu.clear()
  }
}