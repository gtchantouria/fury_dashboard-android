package com.mercadolibre.dashboard.home.views

import androidx.recyclerview.widget.DiffUtil
import com.mercadolibre.dashboard.model.Release


class HomeItemDiffCallback(private val oldList: List<Release>,
                           private val newList: List<Release>) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int)
            = oldList[oldItemPosition] == newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        oldList[1].releaseManager.name
        return oldList[oldItemPosition]._id == newList[newItemPosition]._id
                && oldList[oldItemPosition].releaseManager.name == newList[newItemPosition].releaseManager.name
                && oldList[oldItemPosition].releaseManager.email == newList[newItemPosition].releaseManager.email
    }
}