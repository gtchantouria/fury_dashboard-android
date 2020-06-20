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
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.releaseManager.setTag(null);
        this.releaseVersion.setTag(null);
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
        if (BR.release == variableId) {
            setRelease((com.mercadolibre.dashboard.model.Release) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.mercadolibre.dashboard.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRelease(@Nullable com.mercadolibre.dashboard.model.Release Release) {
        this.mRelease = Release;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.release);
        super.requestRebind();
    }
    public void setVm(@Nullable com.mercadolibre.dashboard.home.HomeViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
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
        com.mercadolibre.dashboard.model.Release release = mRelease;
        int releaseMinor = 0;
        java.lang.String releaseVersionAndroidStringReleaseVersionIntegerToStringReleaseMajorIntegerToStringReleaseMinorIntegerToStringReleaseMinor = null;
        java.lang.String releaseReleaseManagerName = null;
        int releaseMajor = 0;
        com.mercadolibre.dashboard.home.HomeViewModel vm = mVm;
        java.lang.String integerToStringReleaseMajor = null;
        java.lang.String javaLangStringRMReleaseReleaseManagerName = null;
        com.mercadolibre.dashboard.model.ReleaseManager releaseReleaseManager = null;
        java.lang.String integerToStringReleaseMinor = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (release != null) {
                    // read release.minor
                    releaseMinor = release.getMinor();
                    // read release.major
                    releaseMajor = release.getMajor();
                    // read release.releaseManager
                    releaseReleaseManager = release.getReleaseManager();
                }


                // read Integer.toString(release.minor)
                integerToStringReleaseMinor = java.lang.Integer.toString(releaseMinor);
                // read Integer.toString(release.major)
                integerToStringReleaseMajor = java.lang.Integer.toString(releaseMajor);
                if (releaseReleaseManager != null) {
                    // read release.releaseManager.name
                    releaseReleaseManagerName = releaseReleaseManager.getName();
                }


                // read @android:string/release_version
                releaseVersionAndroidStringReleaseVersionIntegerToStringReleaseMajorIntegerToStringReleaseMinorIntegerToStringReleaseMinor = releaseVersion.getResources().getString(R.string.release_version, integerToStringReleaseMajor, integerToStringReleaseMinor, integerToStringReleaseMinor);
                // read ("RM") + (release.releaseManager.name)
                javaLangStringRMReleaseReleaseManagerName = ("RM") + (releaseReleaseManagerName);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseManager, javaLangStringRMReleaseReleaseManagerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseVersion, releaseVersionAndroidStringReleaseVersionIntegerToStringReleaseMajorIntegerToStringReleaseMinorIntegerToStringReleaseMinor);
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
        flag 0 (0x1L): release
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}