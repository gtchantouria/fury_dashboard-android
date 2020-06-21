package com.mercadolibre.dashboard.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class DetailImageFragmentArgs(val imageUrl: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("imageUrl", this.imageUrl)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): DetailImageFragmentArgs {
            bundle.setClassLoader(DetailImageFragmentArgs::class.java.classLoader)
            val __imageUrl : String?
            if (bundle.containsKey("imageUrl")) {
                __imageUrl = bundle.getString("imageUrl")
                if (__imageUrl == null) {
                    throw IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"imageUrl\" is missing and does not have an android:defaultValue")
            }
            return DetailImageFragmentArgs(__imageUrl)
        }
    }
}
