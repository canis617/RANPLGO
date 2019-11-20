package com.hyuncho.ranplgo.ui.guesser

import android.content.Context
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.hyuncho.ranplgo.utils.Location
import com.hyuncho.ranplgo.ui.base.BasePresenter
import com.hyuncho.ranplgo.ui.base.BaseView

interface GuesserContract {
    interface View : BaseView {
        fun updateMap(startLocation: LatLng, circleMarker: CircleOptions)
    }

    interface Presenter :
        BasePresenter<View> {
        fun gameCreate(distance: String, currentLocation : Location)
        fun checkPermission(context: Context)
        fun locationInit(context : Context)
        fun addLocationListener()
        fun showStreetView(context : Context)
        fun guess(context:Context, range : Int)
        fun updateSelected(selectedLocation : LatLng)
    }
}