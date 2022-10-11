// Generated by data binding compiler. Do not edit!
package com.example.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.todoapp.R;
import com.example.todoapp.data.models.ToDoData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView descriptionTxt;

  @NonNull
  public final CardView priorityIndicator;

  @NonNull
  public final ConstraintLayout rowBackground;

  @NonNull
  public final TextView titleTxt;

  @Bindable
  protected ToDoData mToDoData;

  protected RowLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView descriptionTxt, CardView priorityIndicator, ConstraintLayout rowBackground,
      TextView titleTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.descriptionTxt = descriptionTxt;
    this.priorityIndicator = priorityIndicator;
    this.rowBackground = rowBackground;
    this.titleTxt = titleTxt;
  }

  public abstract void setToDoData(@Nullable ToDoData toDoData);

  @Nullable
  public ToDoData getToDoData() {
    return mToDoData;
  }

  @NonNull
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowLayoutBinding>inflateInternal(inflater, R.layout.row_layout, root, attachToRoot, component);
  }

  @NonNull
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowLayoutBinding>inflateInternal(inflater, R.layout.row_layout, null, false, component);
  }

  public static RowLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowLayoutBinding)bind(component, view, R.layout.row_layout);
  }
}