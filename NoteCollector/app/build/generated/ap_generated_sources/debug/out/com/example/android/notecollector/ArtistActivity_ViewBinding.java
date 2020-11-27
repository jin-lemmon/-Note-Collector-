// Generated code from Butter Knife. Do not modify!
package com.example.android.notecollector;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArtistActivity_ViewBinding implements Unbinder {
  private ArtistActivity target;

  private View view2131165309;

  private View view2131165322;

  @UiThread
  public ArtistActivity_ViewBinding(ArtistActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ArtistActivity_ViewBinding(final ArtistActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.mainMenuButton, "method 'mainMenuClick'");
    view2131165309 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.mainMenuClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.nowPlayingButton, "method 'nowPlayinClick'");
    view2131165322 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nowPlayinClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165309.setOnClickListener(null);
    view2131165309 = null;
    view2131165322.setOnClickListener(null);
    view2131165322 = null;
  }
}
