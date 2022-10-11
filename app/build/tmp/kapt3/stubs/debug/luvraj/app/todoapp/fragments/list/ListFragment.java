package luvraj.app.todoapp.fragments.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\u0010\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u000202H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00063"}, d2 = {"Lluvraj/app/todoapp/fragments/list/ListFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "_binding", "Lcom/example/todoapp/databinding/FragmentListBinding;", "adapter", "Landroid/widget/ListAdapter;", "getAdapter", "()Landroid/widget/ListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/example/todoapp/databinding/FragmentListBinding;", "mSharedViewModel", "Lluvraj/app/todoapp/fragments/SharedViewModel;", "getMSharedViewModel", "()Lluvraj/app/todoapp/fragments/SharedViewModel;", "mSharedViewModel$delegate", "mToDoViewModel", "Lluvraj/app/todoapp/data/viewmodel/ToDoViewModel;", "getMToDoViewModel", "()Lluvraj/app/todoapp/data/viewmodel/ToDoViewModel;", "mToDoViewModel$delegate", "confirmRemoval", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onQueryTextChange", "", "query", "", "onQueryTextSubmit", "onViewCreated", "view", "restoreDeletedData", "deletedItem", "Lluvraj/app/todoapp/data/models/ToDoData;", "searchThroughDatabase", "setupRecyclerview", "swipeToDelete", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
public final class ListFragment extends androidx.fragment.app.Fragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private final kotlin.Lazy mToDoViewModel$delegate = null;
    private final kotlin.Lazy mSharedViewModel$delegate = null;
    private com.example.todoapp.databinding.FragmentListBinding _binding;
    private final kotlin.Lazy adapter$delegate = null;
    
    public ListFragment() {
        super();
    }
    
    private final luvraj.app.todoapp.data.viewmodel.ToDoViewModel getMToDoViewModel() {
        return null;
    }
    
    private final luvraj.app.todoapp.fragments.SharedViewModel getMSharedViewModel() {
        return null;
    }
    
    private final com.example.todoapp.databinding.FragmentListBinding getBinding() {
        return null;
    }
    
    private final android.widget.ListAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerview() {
    }
    
    private final void swipeToDelete(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    private final void restoreDeletedData(android.view.View view, luvraj.app.todoapp.data.models.ToDoData deletedItem) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    private final void searchThroughDatabase(java.lang.String query) {
    }
    
    private final void confirmRemoval() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}