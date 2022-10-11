package luvraj.app.todoapp.data.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bJ\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lluvraj/app/todoapp/data/viewmodel/ToDoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getAllData", "Landroidx/lifecycle/LiveData;", "", "Lluvraj/app/todoapp/data/models/ToDoData;", "getGetAllData", "()Landroidx/lifecycle/LiveData;", "repository", "Lluvraj/app/todoapp/data/repository/ToDoRepository;", "sortByHighPriority", "getSortByHighPriority", "sortByLowPriority", "getSortByLowPriority", "toDoDao", "Lluvraj/app/todoapp/data/ToDoDao;", "deleteAll", "", "deleteItem", "toDoData", "insertData", "searchDatabase", "searchQuery", "", "updateData", "app_debug"})
public final class ToDoViewModel extends androidx.lifecycle.AndroidViewModel {
    private final luvraj.app.todoapp.data.ToDoDao toDoDao = null;
    private final luvraj.app.todoapp.data.repository.ToDoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> getAllData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> sortByHighPriority = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> sortByLowPriority = null;
    
    public ToDoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> getGetAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> getSortByHighPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> getSortByLowPriority() {
        return null;
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull()
    luvraj.app.todoapp.data.models.ToDoData toDoData) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    luvraj.app.todoapp.data.models.ToDoData toDoData) {
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    luvraj.app.todoapp.data.models.ToDoData toDoData) {
    }
    
    public final void deleteAll() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<luvraj.app.todoapp.data.models.ToDoData>> searchDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
}