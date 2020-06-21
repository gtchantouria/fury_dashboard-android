package com.mercadolibre.dashboard.features.home.databinding;
import com.mercadolibre.dashboard.features.home.R;
import com.mercadolibre.dashboard.features.home.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.mercadolibre.dashboard.features.home.generated.callback.OnRefreshListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.fragmentHomeImageEmptyList.setTag(null);
        this.fragmentHomeRv.setTag(null);
        this.fragmentHomeSwipeToRefresh.setTag(null);
        this.fragmentHomeTextViewEmptyList.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.mercadolibre.dashboard.features.home.generated.callback.OnRefreshListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewmodel((com.mercadolibre.dashboard.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.mercadolibre.dashboard.home.HomeViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelReleases((androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelReleases(androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>> ViewmodelReleases, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>> viewmodelReleasesGetValue = null;
        androidx.lifecycle.LiveData<com.mercadolibre.dashboard.repository.utils.Resource<java.util.List<com.mercadolibre.dashboard.model.Release>>> viewmodelReleases = null;
        com.mercadolibre.dashboard.home.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.releases
                    viewmodelReleases = viewmodel.getReleases();
                }
                updateLiveDataRegistration(0, viewmodelReleases);


                if (viewmodelReleases != null) {
                    // read viewmodel.releases.getValue()
                    viewmodelReleasesGetValue = viewmodelReleases.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.mercadolibre.dashboard.home.views.HomeBinding.showMessageErrorWhenEmptyList(this.fragmentHomeImageEmptyList, viewmodelReleasesGetValue);
            com.mercadolibre.dashboard.home.views.HomeBinding.setItems(this.fragmentHomeRv, viewmodelReleasesGetValue);
            com.mercadolibre.dashboard.home.views.HomeBinding.showWhenLoading(this.fragmentHomeSwipeToRefresh, viewmodelReleasesGetValue);
            com.mercadolibre.dashboard.home.views.HomeBinding.showMessageErrorWhenEmptyList(this.fragmentHomeTextViewEmptyList, viewmodelReleasesGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.fragmentHomeSwipeToRefresh.setOnRefreshListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnRefresh(int sourceId ) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel.releasesRefreshesItems()
        kotlinx.coroutines.Job viewmodelReleasesRefreshesItems = null;
        // viewmodel
        com.mercadolibre.dashboard.home.HomeViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodelReleasesRefreshesItems = viewmodel.releasesRefreshesItems();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.releases
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}