package com.zaki.countrycodepicker

import android.app.Activity
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.zaki.countrycodepicker.adapter.CountryPickerAdapter
import com.zaki.countrycodepicker.model.Country
import com.zaki.countrycodepicker.utils.Utils

class CCPicker {
    companion object{

        fun showPicker(
            activity: Activity,
            onCountrySelectedListener: CountryPickerAdapter.OnCountrySelectedListener
        ){
            val sheetView =
                activity.layoutInflater.inflate(R.layout.country_code_picker, null)

            val mBottomSheetDialog =
                BottomSheetDialog(activity, R.style.CustomBottomSheetDialogTheme)
            mBottomSheetDialog.setContentView(sheetView)
            mBottomSheetDialog.show()

            val mBehavior = BottomSheetBehavior.from(sheetView.parent as View)
            mBehavior.state = BottomSheetBehavior.STATE_EXPANDED

            sheetView.findViewById<RecyclerView>(R.id.rvCountryPicker).layoutManager = LinearLayoutManager(activity)

            var countries = Utils.loadJSONFromAsset(activity)

            var adapter = CountryPickerAdapter(countries,object : CountryPickerAdapter.OnCountrySelectedListener{
                override fun onCountrySelected(country: Country?) {
                    onCountrySelectedListener.onCountrySelected(country)
                    mBottomSheetDialog.dismiss()
                }

            })
            sheetView.findViewById<RecyclerView>(R.id.rvCountryPicker).adapter = adapter

            sheetView.findViewById<ImageView>(R.id.ivClose).setOnClickListener {
                mBottomSheetDialog.dismiss()
            }
        }
    }
}