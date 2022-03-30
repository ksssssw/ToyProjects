package com.example.android.marsphotos.databinding;
import com.example.android.marsphotos.R;
import com.example.android.marsphotos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOverviewBindingImpl extends FragmentOverviewBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOverviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentOverviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.photosGrid.setTag(null);
        this.statusImage.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.android.marsphotos.overview.OverviewViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.android.marsphotos.overview.OverviewViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPhotos((androidx.lifecycle.LiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>>) object, fieldId);
            case 1 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.android.marsphotos.overview.MarsApiStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPhotos(androidx.lifecycle.LiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>> ViewModelPhotos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.android.marsphotos.overview.MarsApiStatus> ViewModelStatus, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>> viewModelPhotos = null;
        androidx.lifecycle.LiveData<com.example.android.marsphotos.overview.MarsApiStatus> viewModelStatus = null;
        com.example.android.marsphotos.overview.MarsApiStatus viewModelStatusGetValue = null;
        java.util.List<com.example.android.marsphotos.network.MarsPhoto> viewModelPhotosGetValue = null;
        com.example.android.marsphotos.overview.OverviewViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photos
                        viewModelPhotos = viewModel.getPhotos();
                    }
                    updateLiveDataRegistration(0, viewModelPhotos);


                    if (viewModelPhotos != null) {
                        // read viewModel.photos.getValue()
                        viewModelPhotosGetValue = viewModelPhotos.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(1, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.android.marsphotos.BindingAdaptersKt.bindRecyclerView(this.photosGrid, viewModelPhotosGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.android.marsphotos.BindingAdaptersKt.bindStatus(this.statusImage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.photos
        flag 1 (0x2L): viewModel.status
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}