package com.mercadolibre.dashboard.detail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(val login: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("login", this.login)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): DetailFragmentArgs {
            bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
            val __login : String?
            if (bundle.containsKey("login")) {
                __login = bundle.getString("login")
                if (__login == null) {
                    throw IllegalArgumentException("Argument \"login\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"login\" is missing and does not have an android:defaultValue")
            }
            return DetailFragmentArgs(__login)
        }
    }
}
