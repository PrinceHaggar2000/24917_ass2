// Generated by view binder compiler. Do not edit!
package com.example.myrealapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myrealapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView appleBtn;

  @NonNull
  public final ImageView faceBtn;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final EditText passwordInput;

  @NonNull
  public final EditText usernameInput;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull ImageView appleBtn,
      @NonNull ImageView faceBtn, @NonNull Button loginBtn, @NonNull EditText passwordInput,
      @NonNull EditText usernameInput) {
    this.rootView = rootView;
    this.appleBtn = appleBtn;
    this.faceBtn = faceBtn;
    this.loginBtn = loginBtn;
    this.passwordInput = passwordInput;
    this.usernameInput = usernameInput;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.apple_btn;
      ImageView appleBtn = ViewBindings.findChildViewById(rootView, id);
      if (appleBtn == null) {
        break missingId;
      }

      id = R.id.face_btn;
      ImageView faceBtn = ViewBindings.findChildViewById(rootView, id);
      if (faceBtn == null) {
        break missingId;
      }

      id = R.id.login_btn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.password_input;
      EditText passwordInput = ViewBindings.findChildViewById(rootView, id);
      if (passwordInput == null) {
        break missingId;
      }

      id = R.id.username_input;
      EditText usernameInput = ViewBindings.findChildViewById(rootView, id);
      if (usernameInput == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, appleBtn, faceBtn, loginBtn,
          passwordInput, usernameInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
