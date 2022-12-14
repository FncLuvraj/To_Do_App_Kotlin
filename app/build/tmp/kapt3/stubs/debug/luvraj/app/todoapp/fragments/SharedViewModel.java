package luvraj.app.todoapp.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0013\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lluvraj/app/todoapp/fragments/SharedViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "emptyDatabase", "Landroidx/lifecycle/MutableLiveData;", "", "getEmptyDatabase", "()Landroidx/lifecycle/MutableLiveData;", "listener", "Landroid/widget/AdapterView$OnItemSelectedListener;", "getListener", "()Landroid/widget/AdapterView$OnItemSelectedListener;", "checkIfDatabaseEmpty", "", "toDoData", "", "error/NonExistentClass", "parsePriority", "priority", "", "(Ljava/lang/String;)Lerror/NonExistentClass;", "verifyDataFromUser", "title", "description", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * ============================= List Fragment =============================
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> emptyDatabase = null;
    
    /**
     * ============================= Add/Update Fragment =============================
     */
    @org.jetbrains.annotations.NotNull()
    private final android.widget.AdapterView.OnItemSelectedListener listener = null;
    
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEmptyDatabase() {
        return null;
    }
    
    public final void checkIfDatabaseEmpty(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends error.NonExistentClass> toDoData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.AdapterView.OnItemSelectedListener getListener() {
        return null;
    }
    
    public final boolean verifyDataFromUser(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass parsePriority(@org.jetbrains.annotations.NotNull()
    java.lang.String priority) {
        return null;
    }
}