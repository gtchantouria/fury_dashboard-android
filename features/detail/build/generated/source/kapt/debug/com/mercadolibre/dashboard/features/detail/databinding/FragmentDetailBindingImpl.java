package com.mercadolibre.dashboard.features.detail.databinding;
import com.mercadolibre.dashboard.features.detail.R;
import com.mercadolibre.dashboard.features.detail.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailBindingImpl extends FragmentDetailBinding implements com.mercadolibre.dashboard.features.detail.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.lbl_error_introduced, 7);
        sViewsWithIds.put(R.id.lbl_total_errors, 8);
        sViewsWithIds.put(R.id.lbl_crash_rate, 9);
        sViewsWithIds.put(R.id.lbl_adoption, 10);
    }
    // views
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        this.fragmentAdoption.setTag(null);
        this.fragmentCrashRate.setTag(null);
        this.fragmentDetailAvatar.setTag(null);
        this.fragmentDetailRootView.setTag(null);
        this.fragmentErrorsIntroduced.setTag(null);
        this.fragmentTotalErrros.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.mercadolibre.dashboard.features.detail.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.mercadolibre.dashboard.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.mercadolibre.dashboard.detail.DetailViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelMetrics((androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric>) object, fieldId);
            case 1 :
                return onChangeViewmodelIsLoading((androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource.Status>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelMetrics(androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric> ViewmodelMetrics, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsLoading(androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource.Status> ViewmodelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewmodelMetricsErrorsSeenCount = 0;
        java.lang.String stringValueOfViewmodelMetricsErrorsIntroducedCount = null;
        java.lang.String stringValueOfViewmodelMetricsErrorsSeenCount = null;
        androidx.lifecycle.LiveData<com.mercadolibre.dashboard.model.Metric> viewmodelMetrics = null;
        java.lang.String viewmodelMetricsCanejoUrl = null;
        int viewmodelMetricsErrorsIntroducedCount = 0;
        com.mercadolibre.dashboard.repository.utils.Resource.Status viewmodelIsLoadingGetValue = null;
        com.mercadolibre.dashboard.model.Metric viewmodelMetricsGetValue = null;
        com.mercadolibre.dashboard.detail.DetailViewModel viewmodel = mViewmodel;
        androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource.Status> viewmodelIsLoading = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.metrics
                        viewmodelMetrics = viewmodel.getMetrics();
                    }
                    updateLiveDataRegistration(0, viewmodelMetrics);


                    if (viewmodelMetrics != null) {
                        // read viewmodel.metrics.getValue()
                        viewmodelMetricsGetValue = viewmodelMetrics.getValue();
                    }


                    if (viewmodelMetricsGetValue != null) {
                        // read viewmodel.metrics.getValue().errorsSeenCount
                        viewmodelMetricsErrorsSeenCount = viewmodelMetricsGetValue.getErrorsSeenCount();
                        // read viewmodel.metrics.getValue().canejoUrl
                        viewmodelMetricsCanejoUrl = viewmodelMetricsGetValue.getCanejoUrl();
                        // read viewmodel.metrics.getValue().errorsIntroducedCount
                        viewmodelMetricsErrorsIntroducedCount = viewmodelMetricsGetValue.getErrorsIntroducedCount();
                    }


                    // read String.valueOf(viewmodel.metrics.getValue().errorsSeenCount)
                    stringValueOfViewmodelMetricsErrorsSeenCount = java.lang.String.valueOf(viewmodelMetricsErrorsSeenCount);
                    // read String.valueOf(viewmodel.metrics.getValue().errorsIntroducedCount)
                    stringValueOfViewmodelMetricsErrorsIntroducedCount = java.lang.String.valueOf(viewmodelMetricsErrorsIntroducedCount);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isLoading
                        viewmodelIsLoading = viewmodel.isLoading();
                    }
                    updateLiveDataRegistration(1, viewmodelIsLoading);


                    if (viewmodelIsLoading != null) {
                        // read viewmodel.isLoading.getValue()
                        viewmodelIsLoadingGetValue = viewmodelIsLoading.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.mercadolibre.dashboard.detail.views.ReleaseMetricsBinding.adoption(this.fragmentAdoption, viewmodelMetrics);
            com.mercadolibre.dashboard.detail.views.ReleaseMetricsBinding.crashRate(this.fragmentCrashRate, viewmodelMetrics);
            com.mercadolibre.dashboard.detail.views.ReleaseMetricsBinding.loadImageRounded(this.fragmentDetailAvatar, viewmodelMetricsCanejoUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentErrorsIntroduced, stringValueOfViewmodelMetricsErrorsIntroducedCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentTotalErrros, stringValueOfViewmodelMetricsErrorsSeenCount);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.mercadolibre.dashboard.detail.views.ReleaseMetricsBinding.showWhenLoading(this.fragmentDetailRootView, viewmodelIsLoadingGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fragmentDetailRootView.setOnRefreshListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel.reloadDataWhenUserRefreshes()
        kotlinx.coroutines.Job viewmodelReloadDataWhenUserRefreshes = null;
        // viewmodel
        com.mercadolibre.dashboard.detail.DetailViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodelReloadDataWhenUserRefreshes = viewmodel.reloadDataWhenUserRefreshes();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.metrics
        flag 1 (0x2L): viewmodel.isLoading
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}