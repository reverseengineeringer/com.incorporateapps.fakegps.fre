package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.maps.OverlayItem;

public class BalloonOverlayView
  extends FrameLayout
{
  private LinearLayout a;
  private TextView b;
  private TextView c;
  
  public BalloonOverlayView(Context paramContext, int paramInt)
  {
    super(paramContext);
    setPadding(10, 0, 10, paramInt);
    a = new LinearLayout(paramContext);
    a.setVisibility(0);
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130903064, a);
    b = ((TextView)paramContext.findViewById(2131361896));
    c = ((TextView)paramContext.findViewById(2131361897));
    ((ImageView)paramContext.findViewById(2131361898)).setOnClickListener(new c(this));
    paramContext = new FrameLayout.LayoutParams(-2, -2);
    gravity = 0;
    addView(a, paramContext);
  }
  
  public final void a(OverlayItem paramOverlayItem)
  {
    a.setVisibility(0);
    if (paramOverlayItem.getTitle() != null)
    {
      b.setVisibility(0);
      b.setText(paramOverlayItem.getTitle());
    }
    while (paramOverlayItem.getSnippet() != null)
    {
      c.setVisibility(0);
      c.setText(paramOverlayItem.getSnippet());
      return;
      b.setVisibility(8);
    }
    c.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.BalloonOverlayView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */