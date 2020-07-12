package com.mercadolibre.dashboard.detail.views

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.mercadolibre.dashboard.features.detail.R
import com.mercadolibre.dashboard.model.Metric
import com.mercadolibre.dashboard.repository.utils.Resource

object ReleaseMetricsBinding {

    @BindingAdapter("app:showWhenLoading")
    @JvmStatic
    fun showWhenLoading(view: SwipeRefreshLayout, status: Resource.Status?) {
        Log.d(ReleaseMetricsBinding::class.java.simpleName, "Status: $status")
        status?.let {
            view.isRefreshing = it == Resource.Status.LOADING
        }
    }

    @BindingAdapter("app:imageUrlRounded")
    @JvmStatic fun loadImageRounded(view: ImageView, url: String?) {
        Glide.with(view.context).load(R.drawable.ic_default_avatar_white).apply(RequestOptions.circleCropTransform()).into(view)
    }

    @BindingAdapter("app:crashRate")
    @JvmStatic
    fun crashRate(view: TextView, metrics: LiveData<Metric>) {
        metrics.value?.let {
            val crashRate = it.unhandledSessionsCount.toFloat() / it.totalSessionsCount.toFloat() * 100
            view.text = String.format("%.2f%%", crashRate)
        }
    }

    @BindingAdapter("app:adoption")
    @JvmStatic
    fun adoption(view: TextView, metrics: LiveData<Metric>) {
        metrics.value?.let {
            val sessions = it.releaseSessionsCount.toFloat() / it.sessionsCount.toFloat()
            val adoption = (it.sessionsCountInLast24H.toFloat() / sessions) * 100
            view.text = String.format("%.2f%%", adoption)
        }
    }
}