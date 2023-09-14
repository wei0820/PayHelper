// Generated by view binder compiler. Do not edit!
package com.tools.payhelper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.tools.payhelper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBuyRecordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton closeBtn;

  @NonNull
  public final Button datebtn;

  @NonNull
  public final TextView dayedt;

  @NonNull
  public final RelativeLayout daylayout;

  @NonNull
  public final RecyclerView recyclerView;

  private ActivityBuyRecordBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton closeBtn, @NonNull Button datebtn, @NonNull TextView dayedt,
      @NonNull RelativeLayout daylayout, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.closeBtn = closeBtn;
    this.datebtn = datebtn;
    this.dayedt = dayedt;
    this.daylayout = daylayout;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBuyRecordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBuyRecordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_buy_record, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBuyRecordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.closeBtn;
      ImageButton closeBtn = rootView.findViewById(id);
      if (closeBtn == null) {
        break missingId;
      }

      id = R.id.datebtn;
      Button datebtn = rootView.findViewById(id);
      if (datebtn == null) {
        break missingId;
      }

      id = R.id.dayedt;
      TextView dayedt = rootView.findViewById(id);
      if (dayedt == null) {
        break missingId;
      }

      id = R.id.daylayout;
      RelativeLayout daylayout = rootView.findViewById(id);
      if (daylayout == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ActivityBuyRecordBinding((ConstraintLayout) rootView, closeBtn, datebtn, dayedt,
          daylayout, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
