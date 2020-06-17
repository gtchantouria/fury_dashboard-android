package com.mercadolibre.dashboard.features.home.databinding;
import com.mercadolibre.dashboard.features.home.R;
import com.mercadolibre.dashboard.features.home.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHomeBindingImpl extends ItemHomeBinding implements com.mercadolibre.dashboard.features.home.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageView.setTag(null);
        this.itemHomeRoot.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.mercadolibre.dashboard.features.home.generated.callback.OnClickListener(this, 1);
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
        if (BR.vm == variableId) {
            setVm((com.mercadolibre.dashboard.home.HomeViewModel) variable);
        }
        else if (BR.release == variableId) {
            setRelease((com.mercadolibre.dashboard.model.Release) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.mercadolibre.dashboard.home.HomeViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setRelease(@Nullable com.mercadolibre.dashboard.model.Release Release) {
        this.mRelease = Release;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.release);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String releaseReleaseManagerEmail = null;
        com.mercadolibre.dashboard.home.HomeViewModel vm = mVm;
        com.mercadolibre.dashboard.model.Release release = mRelease;
        java.lang.String releaseReleaseManagerName = null;
        com.mercadolibre.dashboard.model.ReleaseManager releaseReleaseManager = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (release != null) {
                    // read release.releaseManager
                    releaseReleaseManager = release.getReleaseManager();
                }


                if (releaseReleaseManager != null) {
                    // read release.releaseManager.email
                    releaseReleaseManagerEmail = releaseReleaseManager.getEmail();
                    // read release.releaseManager.name
                    releaseReleaseManagerName = releaseReleaseManager.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.mercadolibre.dashboard.home.views.HomeBinding.loadImage(this.imageView, releaseReleaseManagerEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, releaseReleaseManagerName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.itemHomeRoot.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.mercadolibre.dashboard.home.HomeViewModel vm = mVm;
        // release
        com.mercadolibre.dashboard.model.Release release = mRelease;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            vm.releasesClicksOnItem(release);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): release
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}