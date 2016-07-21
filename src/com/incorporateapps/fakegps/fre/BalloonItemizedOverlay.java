package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MapView.LayoutParams;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.Projection;
import java.util.Iterator;
import java.util.List;

public abstract class BalloonItemizedOverlay
  extends ItemizedOverlay
{
  final MapController a;
  boolean b;
  private MapView c;
  private BalloonOverlayView d;
  private View e;
  private int f;
  private OverlayItem g;
  private GeoPoint h;
  private int i;
  private int j = -1;
  private String k;
  private String l;
  private Paint m;
  private Paint n;
  private Point o;
  private Drawable p;
  private Drawable q;
  private int r;
  private int s;
  private boolean t = false;
  
  public BalloonItemizedOverlay(Drawable paramDrawable, MapView paramMapView)
  {
    super(boundCenterBottom(paramDrawable));
    c = paramMapView;
    q = paramDrawable;
    f = paramDrawable.getIntrinsicHeight();
    a = paramMapView.getController();
  }
  
  public static void a(GeoPoint paramGeoPoint, Context paramContext)
  {
    try
    {
      paramGeoPoint = "google.streetview:cbll=" + paramGeoPoint.getLatitudeE6() / 1000000.0D + "," + paramGeoPoint.getLongitudeE6() / 1000000.0D + "&cbp=1,0,0,0,0.0&mz=1.0";
      Intent localIntent = new Intent();
      localIntent.setData(Uri.parse(paramGeoPoint));
      localIntent.setAction("android.intent.action.VIEW");
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception paramGeoPoint)
    {
      Log.e("exception street view", paramGeoPoint.toString());
    }
  }
  
  public final int a()
  {
    return i;
  }
  
  public final void a(int paramInt)
  {
    i = paramInt;
  }
  
  public final void a(GeoPoint paramGeoPoint)
  {
    h = paramGeoPoint;
  }
  
  public final void a(OverlayItem paramOverlayItem)
  {
    g = paramOverlayItem;
  }
  
  public final void a(String paramString)
  {
    l = paramString;
  }
  
  public final GeoPoint b()
  {
    return h;
  }
  
  public final void b(String paramString)
  {
    k = paramString;
  }
  
  protected boolean b(int paramInt)
  {
    return false;
  }
  
  protected final void c()
  {
    if (d != null) {
      d.setVisibility(8);
    }
  }
  
  public final void d()
  {
    Object localObject1 = h;
    int i1;
    if (d == null)
    {
      d = new BalloonOverlayView(c.getContext(), f);
      e = d.findViewById(2131361895);
      ((ImageView)d.findViewById(2131361899)).setOnClickListener(new a(this));
      i1 = 0;
    }
    for (;;)
    {
      d.setVisibility(8);
      Object localObject2 = c.getOverlays();
      label110:
      int i2;
      if (((List)localObject2).size() > 1)
      {
        localObject2 = ((List)localObject2).iterator();
        if (((Iterator)localObject2).hasNext()) {}
      }
      else
      {
        d.a(g);
        localObject1 = new MapView.LayoutParams(-2, -2, (GeoPoint)localObject1, 81);
        mode = 0;
        i2 = i;
      }
      try
      {
        getClass().getDeclaredMethod("onBalloonTap", new Class[] { Integer.TYPE });
        e.setOnTouchListener(new b(this, i2));
        d.setVisibility(0);
        if (i1 != 0)
        {
          d.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          return;
          i1 = 1;
          continue;
          Overlay localOverlay = (Overlay)((Iterator)localObject2).next();
          if ((!(localOverlay instanceof BalloonItemizedOverlay)) || (localOverlay == this)) {
            break label110;
          }
          ((BalloonItemizedOverlay)localOverlay).c();
          t = false;
        }
      }
      catch (SecurityException localSecurityException)
      {
        for (;;)
        {
          Log.e("BalloonItemizedOverlay", "setBalloonTouchListener reflection SecurityException");
        }
        c.addView(d, (ViewGroup.LayoutParams)localObject1);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
  }
  
  public void draw(Canvas paramCanvas, MapView paramMapView, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      if (t)
      {
        if (p == null)
        {
          p = paramMapView.getContext().getResources().getDrawable(2130837688);
          r = p.getIntrinsicWidth();
          s = p.getIntrinsicHeight();
          o = new Point();
        }
        Projection localProjection = paramMapView.getProjection();
        int i1 = j;
        localProjection.toPixels(h, o);
        PreferenceManager.getDefaultSharedPreferences(paramMapView.getContext());
        float f2 = i1;
        double d1 = h.getLatitudeE6() / 1000000.0D;
        float f1 = f2;
        if ("meters".equals("feet")) {
          f1 = (int)(f2 / 3.28084F);
        }
        int i3 = (int)(paramMapView.getProjection().metersToEquatorPixels(f1) * (1.0D / Math.cos(Math.toRadians(d1))));
        n = new Paint();
        m = new Paint();
        int i2 = Color.argb(100, 19, 61, 255);
        i1 = Color.argb(50, 19, 61, 255);
        if (b)
        {
          i1 = Color.argb(50, 255, 69, 0);
          i2 = Color.argb(100, 255, 0, 0);
        }
        n.setColor(i2);
        n.setStyle(Paint.Style.STROKE);
        n.setAntiAlias(true);
        n.setStrokeWidth(2.0F);
        m.setColor(i1);
        m.setStyle(Paint.Style.FILL);
        m.setAntiAlias(true);
        m.setStrokeWidth(2.0F);
        paramCanvas.drawCircle(o.x, o.y, i3, m);
        paramCanvas.drawCircle(o.x, o.y, i3, n);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("Draw circle exception", localException.toString());
      }
    }
    super.draw(paramCanvas, paramMapView, paramBoolean);
  }
  
  protected final boolean onTap(int paramInt)
  {
    t = false;
    d();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.BalloonItemizedOverlay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */