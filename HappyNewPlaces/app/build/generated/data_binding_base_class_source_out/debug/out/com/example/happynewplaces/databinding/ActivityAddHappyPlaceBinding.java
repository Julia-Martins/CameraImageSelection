// Generated by view binder compiler. Do not edit!
package com.example.happynewplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.happynewplaces.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddHappyPlaceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final AppCompatImageView imgPlaceImage;

  @NonNull
  public final ScrollView mainSV;

  @NonNull
  public final Toolbar toolAddPlace;

  @NonNull
  public final TextView txtAddImage;

  @NonNull
  public final AppCompatEditText txtDate;

  @NonNull
  public final TextInputLayout txtDateMain;

  @NonNull
  public final AppCompatEditText txtDescription;

  @NonNull
  public final TextInputLayout txtDescriptionMain;

  @NonNull
  public final AppCompatEditText txtLocation;

  @NonNull
  public final TextInputLayout txtLocationMain;

  @NonNull
  public final AppCompatEditText txtTitle;

  @NonNull
  public final TextInputLayout txtTitleMain;

  private ActivityAddHappyPlaceBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSave,
      @NonNull AppCompatImageView imgPlaceImage, @NonNull ScrollView mainSV,
      @NonNull Toolbar toolAddPlace, @NonNull TextView txtAddImage,
      @NonNull AppCompatEditText txtDate, @NonNull TextInputLayout txtDateMain,
      @NonNull AppCompatEditText txtDescription, @NonNull TextInputLayout txtDescriptionMain,
      @NonNull AppCompatEditText txtLocation, @NonNull TextInputLayout txtLocationMain,
      @NonNull AppCompatEditText txtTitle, @NonNull TextInputLayout txtTitleMain) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.imgPlaceImage = imgPlaceImage;
    this.mainSV = mainSV;
    this.toolAddPlace = toolAddPlace;
    this.txtAddImage = txtAddImage;
    this.txtDate = txtDate;
    this.txtDateMain = txtDateMain;
    this.txtDescription = txtDescription;
    this.txtDescriptionMain = txtDescriptionMain;
    this.txtLocation = txtLocation;
    this.txtLocationMain = txtLocationMain;
    this.txtTitle = txtTitle;
    this.txtTitleMain = txtTitleMain;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_happy_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSave;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.imgPlaceImage;
      AppCompatImageView imgPlaceImage = ViewBindings.findChildViewById(rootView, id);
      if (imgPlaceImage == null) {
        break missingId;
      }

      id = R.id.main_SV;
      ScrollView mainSV = ViewBindings.findChildViewById(rootView, id);
      if (mainSV == null) {
        break missingId;
      }

      id = R.id.tool_Add_place;
      Toolbar toolAddPlace = ViewBindings.findChildViewById(rootView, id);
      if (toolAddPlace == null) {
        break missingId;
      }

      id = R.id.txtAddImage;
      TextView txtAddImage = ViewBindings.findChildViewById(rootView, id);
      if (txtAddImage == null) {
        break missingId;
      }

      id = R.id.txtDate;
      AppCompatEditText txtDate = ViewBindings.findChildViewById(rootView, id);
      if (txtDate == null) {
        break missingId;
      }

      id = R.id.txtDateMain;
      TextInputLayout txtDateMain = ViewBindings.findChildViewById(rootView, id);
      if (txtDateMain == null) {
        break missingId;
      }

      id = R.id.txtDescription;
      AppCompatEditText txtDescription = ViewBindings.findChildViewById(rootView, id);
      if (txtDescription == null) {
        break missingId;
      }

      id = R.id.txtDescriptionMain;
      TextInputLayout txtDescriptionMain = ViewBindings.findChildViewById(rootView, id);
      if (txtDescriptionMain == null) {
        break missingId;
      }

      id = R.id.txtLocation;
      AppCompatEditText txtLocation = ViewBindings.findChildViewById(rootView, id);
      if (txtLocation == null) {
        break missingId;
      }

      id = R.id.txtLocationMain;
      TextInputLayout txtLocationMain = ViewBindings.findChildViewById(rootView, id);
      if (txtLocationMain == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      AppCompatEditText txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      id = R.id.txtTitleMain;
      TextInputLayout txtTitleMain = ViewBindings.findChildViewById(rootView, id);
      if (txtTitleMain == null) {
        break missingId;
      }

      return new ActivityAddHappyPlaceBinding((ConstraintLayout) rootView, btnSave, imgPlaceImage,
          mainSV, toolAddPlace, txtAddImage, txtDate, txtDateMain, txtDescription,
          txtDescriptionMain, txtLocation, txtLocationMain, txtTitle, txtTitleMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
