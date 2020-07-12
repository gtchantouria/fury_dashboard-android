package com.mercadolibre.dashboard.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.mercadolibre.dashboard.navigation.R
import kotlin.Int

class HomeFragmentDirections private constructor() {
    private data class ActionHomeFragmentToDetailFragment(val releaseId: Int) : NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_detailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("releaseId", this.releaseId)
            return result
        }
    }

    companion object {
        fun actionHomeFragmentToDetailFragment(releaseId: Int): NavDirections =
                ActionHomeFragmentToDetailFragment(releaseId)
    }
}
