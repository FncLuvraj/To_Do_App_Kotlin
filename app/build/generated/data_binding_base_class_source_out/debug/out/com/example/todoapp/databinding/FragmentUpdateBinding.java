// Generated by data binding compiler. Do not edit!
package com.example.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.todoapp.R;
import com.example.todoapp.fragments.update.UpdateFragmentArgs;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentUpdateBinding extends ViewDataBinding {
  @NonNull
  public final EditText currentDescriptionEt;

  @NonNull
  public final Spinner currentPrioritiesSpinner;

  @NonNull
  public final EditText currentTitleEt;

  @Bindable
  protected UpdateFragmentArgs mArgs;

  protected FragmentUpdateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText currentDescriptionEt, Spinner currentPrioritiesSpinner, EditText currentTitleEt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.currentDescriptionEt = currentDescriptionEt;
    this.currentPrioritiesSpinner = currentPrioritiesSpinner;
    this.currentTitleEt = currentTitleEt;
  }

  public abstract void setArgs(@Nullable UpdateFragmentArgs args);

  @Nullable
  public UpdateFragmentArgs getArgs() {
    return mArgs;
  }

  @NonNull
  public static FragmentUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_update, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUpdateBinding>inflateInternal(inflater, R.layout.fragment_update, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_update, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUpdateBinding>inflateInternal(inflater, R.layout.fragment_update, null, false, component);
  }

  public static FragmentUpdateBinding bind(@NonNull View view) {
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
  public static FragmentUpdateBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUpdateBinding)bind(component, view, R.layout.fragment_update);
  }
}
