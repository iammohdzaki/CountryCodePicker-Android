package com.zaki.ccpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.zaki.countrycodepicker.CCPicker
import com.zaki.countrycodepicker.adapter.CountryPickerAdapter
import com.zaki.countrycodepicker.model.Country

class MainActivity : AppCompatActivity() {

    private lateinit var tvSelected :TextView
    private lateinit var btnOpen :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSelected = findViewById(R.id.tvSelected)
        btnOpen = findViewById(R.id.btnOpen)

        btnOpen.setOnClickListener {
            CCPicker.showPicker(this,object : CountryPickerAdapter.OnCountrySelectedListener{
                override fun onCountrySelected(country: Country?) {
                    tvSelected.text = country?.countryName
                }

            })
        }

    }
}