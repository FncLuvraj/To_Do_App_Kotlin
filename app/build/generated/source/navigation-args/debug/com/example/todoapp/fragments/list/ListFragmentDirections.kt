package com.example.todoapp.fragments.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.todoapp.R
import com.example.todoapp.`data`.models.ToDoData
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToUpdateFragment(
    public val currentItem: ToDoData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_listFragment_to_updateFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ToDoData::class.java)) {
          result.putParcelable("currentItem", this.currentItem as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ToDoData::class.java)) {
          result.putSerializable("currentItem", this.currentItem as Serializable)
        } else {
          throw UnsupportedOperationException(ToDoData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionListFragmentToAddFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_addFragment)

    public fun actionListFragmentToUpdateFragment(currentItem: ToDoData): NavDirections =
        ActionListFragmentToUpdateFragment(currentItem)
  }
}
