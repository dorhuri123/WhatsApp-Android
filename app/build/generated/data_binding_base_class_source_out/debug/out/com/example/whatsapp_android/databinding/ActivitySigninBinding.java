// Generated by view binder compiler. Do not edit!
package com.example.whatsapp_android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.whatsapp_android.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySigninBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnSignIn;

  @NonNull
  public final EditText inputPasswordSignIn;

  @NonNull
  public final EditText inputUsernameSignIn;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final AppCompatImageView settingsImage;

  @NonNull
  public final TextView textCreateNewAccount;

  private ActivitySigninBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnSignIn, @NonNull EditText inputPasswordSignIn,
      @NonNull EditText inputUsernameSignIn, @NonNull ProgressBar progressBar,
      @NonNull AppCompatImageView settingsImage, @NonNull TextView textCreateNewAccount) {
    this.rootView = rootView;
    this.btnSignIn = btnSignIn;
    this.inputPasswordSignIn = inputPasswordSignIn;
    this.inputUsernameSignIn = inputUsernameSignIn;
    this.progressBar = progressBar;
    this.settingsImage = settingsImage;
    this.textCreateNewAccount = textCreateNewAccount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySigninBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignIn;
      MaterialButton btnSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btnSignIn == null) {
        break missingId;
      }

      id = R.id.inputPasswordSignIn;
      EditText inputPasswordSignIn = ViewBindings.findChildViewById(rootView, id);
      if (inputPasswordSignIn == null) {
        break missingId;
      }

      id = R.id.inputUsernameSignIn;
      EditText inputUsernameSignIn = ViewBindings.findChildViewById(rootView, id);
      if (inputUsernameSignIn == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.settingsImage;
      AppCompatImageView settingsImage = ViewBindings.findChildViewById(rootView, id);
      if (settingsImage == null) {
        break missingId;
      }

      id = R.id.textCreateNewAccount;
      TextView textCreateNewAccount = ViewBindings.findChildViewById(rootView, id);
      if (textCreateNewAccount == null) {
        break missingId;
      }

      return new ActivitySigninBinding((ConstraintLayout) rootView, btnSignIn, inputPasswordSignIn,
          inputUsernameSignIn, progressBar, settingsImage, textCreateNewAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
