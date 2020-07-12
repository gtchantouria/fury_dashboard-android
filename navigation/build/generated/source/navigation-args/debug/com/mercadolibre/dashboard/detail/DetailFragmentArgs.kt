package com.mercadolibre.dashboard.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(val releaseId: Int) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putInt("releaseId", this.releaseId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): DetailFragmentArgs {
            bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
            val __releaseId : Int
            if (bundle.containsKey("releaseId")) {
                __releaseId = bundle.getInt("releaseId")
            } else {
                throw IllegalArgumentException("Required argument \"releaseId\" is missing and does not have an android:defaultValue")
            }
            return DetailFragmentArgs(__releaseId)
        }
    }
}
