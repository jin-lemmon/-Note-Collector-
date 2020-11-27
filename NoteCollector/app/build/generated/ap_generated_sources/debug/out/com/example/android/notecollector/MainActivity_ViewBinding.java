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

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165402;

  private View view2131165223;

  private View view2131165321;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tracks, "method 'tracksIntent'");
    view2131165402 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tracksIntent(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.artist, "method 'artistIntent'");
    view2131165223 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.artistIntent(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.nowPlaying, "method 'nowPlayingIntent'");
    view2131165321 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nowPlayingIntent(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165402.setOnClickListener(null);
    view2131165402 = null;
    view2131165223.setOnClickListener(null);
    view2131165223 = null;
    view2131165321.setOnClickListener(null);
    view2131165321 = null;
  }
}
