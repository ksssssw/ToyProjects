package com.example.android.marsphotos.overview;

import java.lang.System;

/**
 * ListAdapter는 RecyclerView.Adapter 클래스의 서브클래스로 백그라운드 스래드의 목록간 차이를 계산하는
 * 작업을 포함하여 리스트 데이터를 리사이클러뷰에 표시하기 위한 것이다.
 * DiffUtil을 사용하면 이점은 리사이클러뷰에서 일부 항목이 추가되거나 삭제 또는 변경 될 때마다
 * 전체 목록이 새로고침 되지 않는다는 점이 있다. 즉 변경된 항목만 새로고침된다.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/marsphotos/overview/PhotoGridAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/android/marsphotos/network/MarsPhoto;", "Lcom/example/android/marsphotos/overview/PhotoGridAdapter$MarsPhotosViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "MarsPhotosViewHolder", "app_debug"})
public final class PhotoGridAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.android.marsphotos.network.MarsPhoto, com.example.android.marsphotos.overview.PhotoGridAdapter.MarsPhotosViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.marsphotos.overview.PhotoGridAdapter.DiffCallback DiffCallback = null;
    
    public PhotoGridAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.android.marsphotos.overview.PhotoGridAdapter.MarsPhotosViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.android.marsphotos.overview.PhotoGridAdapter.MarsPhotosViewHolder holder, int position) {
    }
    
    /**
     * RecyclerView.ViewHolder 를 확장하는 내부 클래스 정의를 추가한다.
     * MarsPhoto를 레이아웃에 결합하기 위한 GridViewItemBinding 변수가 필요하므로, 이 변수를 MarsPhotoViewHolder 에
     * 전달한다. 기본 ViewHolder 클래스는 생성자에 뷰가 있어야 한다. 이 클래스를 결합 루트 뷰에 전달한다.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/android/marsphotos/overview/PhotoGridAdapter$MarsPhotosViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/android/marsphotos/databinding/GridViewItemBinding;", "(Lcom/example/android/marsphotos/databinding/GridViewItemBinding;)V", "bind", "", "MarsPhoto", "Lcom/example/android/marsphotos/network/MarsPhoto;", "app_debug"})
    public static final class MarsPhotosViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.android.marsphotos.databinding.GridViewItemBinding binding;
        
        public MarsPhotosViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.databinding.GridViewItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.network.MarsPhoto MarsPhoto) {
        }
    }
    
    /**
     * DiffCallback 컴패니언 객체 정의를 추가한다.
     * 이 객체는 비교할 일반 객체 유형 MarsPhoto 로 DiffUtil.ItemCallback 을 확장한다. 이 구현 내부에서 두 사진을 비교한다.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/android/marsphotos/overview/PhotoGridAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/android/marsphotos/network/MarsPhoto;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.android.marsphotos.network.MarsPhoto> {
        
        private DiffCallback() {
            super();
        }
        
        /**
         * 이 메서드는 DiffUtil에서 호춛뢰어 두 객체가 동일한 항목을 나타내는지 여부를 확인한다.
         * DiffUtil은 이 메서드를 사용하여 새 MarsPhoto 객체가 이전 MarsPhoto 객체와 동일한지 확인한다.
         * 모든 항목의 id는 고유한다. oldItem과 newItem id를 비교하여 결과를 반환한다.
         */
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.network.MarsPhoto oldItem, @org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.network.MarsPhoto newItem) {
            return false;
        }
        
        /**
         * 이 메서드는 두 항목의 데이터가 동일한지 확인하려고 할 때 DiffUtil에서 호출된다.
         * MarsPhoto에서 중요한 데이터는 이미지 URL이다. oldItem과 newItem의 url을 비교하여 결과를 반환한다.
         */
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.network.MarsPhoto oldItem, @org.jetbrains.annotations.NotNull()
        com.example.android.marsphotos.network.MarsPhoto newItem) {
            return false;
        }
    }
}