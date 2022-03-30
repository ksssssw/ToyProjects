package com.example.android.marsphotos.overview;

import java.lang.System;

/**
 * The [ViewModel] that is attached to the [OverviewFragment].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/marsphotos/overview/OverviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_photos", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/android/marsphotos/network/MarsPhoto;", "_status", "Lcom/example/android/marsphotos/overview/MarsApiStatus;", "photos", "Landroidx/lifecycle/LiveData;", "getPhotos", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "getMarsPhotos", "", "app_debug"})
public final class OverviewViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.android.marsphotos.overview.MarsApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.marsphotos.overview.MarsApiStatus> status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>> _photos = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>> photos = null;
    
    public OverviewViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.marsphotos.overview.MarsApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.marsphotos.network.MarsPhoto>> getPhotos() {
        return null;
    }
    
    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [MarsPhoto] [List] [LiveData].
     */
    private final void getMarsPhotos() {
    }
}