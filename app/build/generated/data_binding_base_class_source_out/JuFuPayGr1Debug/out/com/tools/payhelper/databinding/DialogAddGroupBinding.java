// Generated by view binder compiler. Do not edit!
package com.tools.payhelper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.tools.payhelper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogAddGroupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText bankCard;

  @NonNull
  public final EditText bankCardNo;

  @NonNull
  public final Button closeBtn;

  @NonNull
  public final RelativeLayout loading;

  @NonNull
  public final TextView message;

  @NonNull
  public final Button okBtn;

  @NonNull
  public final EditText teledt;

  @NonNull
  public final TextView text1;

  @NonNull
  public final TextView text2;

  private DialogAddGroupBinding(@NonNull RelativeLayout rootView, @NonNull EditText bankCard,
      @NonNull EditText bankCardNo, @NonNull Button closeBtn, @NonNull RelativeLayout loading,
      @NonNull TextView message, @NonNull Button okBtn, @NonNull EditText teledt,
      @NonNull TextView text1, @NonNull TextView text2) {
    this.rootView = rootView;
    this.bankCard = bankCard;
    this.bankCardNo = bankCardNo;
    this.closeBtn = closeBtn;
    this.loading = loading;
    this.message = message;
    this.okBtn = okBtn;
    this.teledt = teledt;
    this.text1 = text1;
    this.text2 = text2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogAddGroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogAddGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_add_group, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogAddGroupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bank_card;
      EditText bankCard = rootView.findViewById(id);
      if (bankCard == null) {
        break missingId;
      }

      id = R.id.bank_card_no;
      EditText bankCardNo = rootView.findViewById(id);
      if (bankCardNo == null) {
        break missingId;
      }

      id = R.id.closeBtn;
      Button closeBtn = rootView.findViewById(id);
      if (closeBtn == null) {
        break missingId;
      }

      RelativeLayout loading = (RelativeLayout) rootView;

      id = R.id.message;
      TextView message = rootView.findViewById(id);
      if (message == null) {
        break missingId;
      }

      id = R.id.okBtn;
      Button okBtn = rootView.findViewById(id);
      if (okBtn == null) {
        break missingId;
      }

      id = R.id.teledt;
      EditText teledt = rootView.findViewById(id);
      if (teledt == null) {
        break missingId;
      }

      id = R.id.text1;
      TextView text1 = rootView.findViewById(id);
      if (text1 == null) {
        break missingId;
      }

      id = R.id.text2;
      TextView text2 = rootView.findViewById(id);
      if (text2 == null) {
        break missingId;
      }

      return new DialogAddGroupBinding((RelativeLayout) rootView, bankCard, bankCardNo, closeBtn,
          loading, message, okBtn, teledt, text1, text2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
