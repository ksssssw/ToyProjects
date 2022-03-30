package com.example.android.marsphotos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007\u001a\u001a\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"bindImage", "", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "bindRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/example/android/marsphotos/network/MarsPhoto;", "bindStatus", "statusImageView", "status", "Lcom/example/android/marsphotos/overview/MarsApiStatus;", "app_debug"})
public final class BindingAdaptersKt {
    
    /**
     * @BindingAdapter 주석을 추가한다.
     * 이 주석은 뷰 항목에 imageUrl 속성이 있는 경우 이 결합 어댑터를 실행하도록 데이터 결합에 지시한다.
     */
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.android.marsphotos.network.MarsPhoto> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"marsApiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.example.android.marsphotos.overview.MarsApiStatus status) {
    }
}