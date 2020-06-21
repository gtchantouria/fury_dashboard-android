package com.mercadolibre.dashboard.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.mercadolibre.dashboard.navigation.R
import kotlin.Int
import kotlin.String

class HomeFragmentDirections private constructor() {
    private data class ActionHomeFragmentToDetailFragment(val login: String) : NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_detailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("login", this.login)
            return result
        }
    }

    companion object {
        fun actionHomeFragmentToDetailFragment(login: String): NavDirections =
                ActionHomeFragmentToDetailFragment(login)
    }
}
