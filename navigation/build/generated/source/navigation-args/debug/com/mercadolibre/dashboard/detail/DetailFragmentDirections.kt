package com.mercadolibre.dashboard.detail

import android.os.Bundle
import androidx.navigation.NavDirections
import com.mercadolibre.dashboard.navigation.R
import kotlin.Int
import kotlin.String

class DetailFragmentDirections private constructor() {
    private data class ActionDetailFragmentToImageDetailFragment(val imageUrl: String) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_detailFragment_to_imageDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("imageUrl", this.imageUrl)
            return result
        }
    }

    companion object {
        fun actionDetailFragmentToImageDetailFragment(imageUrl: String): NavDirections =
                ActionDetailFragmentToImageDetailFragment(imageUrl)
    }
}
