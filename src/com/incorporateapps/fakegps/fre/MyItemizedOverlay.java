package com.incorporateapps.fakegps.fre;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.Projection;
import java.util.ArrayList;
import java.util.Iterator;

public class MyItemizedOverlay
  extends BalloonItemizedOverlay
{
  Resources c;
  boolean d = false;
  boolean e = false;
  Bundle f = new Bundle();
  int g;
  int h;
  SharedPreferences i;
  SharedPreferences.Editor j;
  boolean k = false;
  private ArrayList l = new ArrayList();
  private Context m;
  private Maps n;
  private MapView o = null;
  private Drawable p = null;
  private OverlayItem q = null;
  private ImageView r = null;
  private int s = 0;
  private int t = 0;
  private int u = 0;
  private int v = 0;
  private ProgressDialog w = null;
  
  public MyItemizedOverlay(Drawable paramDrawable, MapView paramMapView, Maps paramMaps)
  {
    super(boundCenter(paramDrawable), paramMapView);
    m = paramMapView.getContext();
    n = paramMaps;
    i = PreferenceManager.getDefaultSharedPreferences(m);
    j = i.edit();
    p = paramDrawable;
    o = paramMapView;
    d = true;
    e = false;
    c = m.getResources();
    h = 2130837692;
    if (d)
    {
      r = ((ImageView)paramMaps.findViewById(2131361916));
      r.setImageResource(h);
      s = (paramDrawable.getIntrinsicWidth() / 2);
      t = paramDrawable.getIntrinsicHeight();
    }
    populate();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (r != null)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)r.getLayoutParams();
      localLayoutParams.setMargins(paramInt1 - s - u, paramInt2 - t - v, 0, 0);
      r.setLayoutParams(localLayoutParams);
    }
  }
  
  public final void b(OverlayItem paramOverlayItem)
  {
    l.add(paramOverlayItem);
    setLastFocusedIndex(-1);
    populate();
  }
  
  protected final boolean b(int paramInt)
  {
    new Bundle();
    g = paramInt;
    new AlertDialog.Builder(m).setIcon(2130837681).setTitle(2131230822).setMessage(2131230823).setPositiveButton(2131230875, new av(this)).create().show();
    return true;
  }
  
  public final void c(int paramInt)
  {
    l.remove(paramInt);
    setLastFocusedIndex(-1);
    populate();
  }
  
  protected OverlayItem createItem(int paramInt)
  {
    a(paramInt);
    return (OverlayItem)l.get(paramInt);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent, MapView paramMapView)
  {
    int i1 = paramMotionEvent.getAction();
    int i2 = (int)paramMotionEvent.getX();
    int i3 = (int)paramMotionEvent.getY();
    Object localObject;
    if (d)
    {
      r = ((ImageView)n.findViewById(2131361916));
      if (h > 0) {
        r.setImageResource(h);
      }
      if (p != null)
      {
        s = (p.getIntrinsicWidth() / 2);
        t = p.getIntrinsicHeight();
      }
      if (i1 == 0)
      {
        c();
        localObject = l.iterator();
        if (!((Iterator)localObject).hasNext()) {
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      if ((i1 == 0) && (!super.onTouchEvent(paramMotionEvent, paramMapView)))
      {
        return false;
        OverlayItem localOverlayItem = (OverlayItem)((Iterator)localObject).next();
        Point localPoint = new Point(0, 0);
        o.getProjection().toPixels(localOverlayItem.getPoint(), localPoint);
        if (!hitTest(localOverlayItem, p, i2 - x, i3 - y)) {
          break;
        }
        q = localOverlayItem;
        l.remove(q);
        populate();
        u = 0;
        v = 0;
        a(x, y);
        if (r != null) {
          r.setVisibility(0);
        }
        u = (i2 - x);
        v = (i3 - y);
        i1 = 1;
        continue;
        if ((i1 == 2) && (q != null))
        {
          if (!k) {
            k = true;
          }
          a(i2, i3);
          i1 = 1;
          continue;
        }
        if ((i1 != 1) || (q == null)) {
          break label549;
        }
        r.setVisibility(8);
        localObject = o.getProjection().fromPixels(i2 - u, i3 - v);
        localOverlayItem = new OverlayItem((GeoPoint)localObject, q.getTitle(), q.getSnippet());
        l.add(localOverlayItem);
        populate();
        q = null;
        a((GeoPoint)localObject);
        l.clear();
        setLastFocusedIndex(-1);
        populate();
        n.a((GeoPoint)localObject, "", c.getString(2131230807), this);
        n.b((GeoPoint)localObject);
        k = false;
        j.putFloat("CurrentLat", ((GeoPoint)localObject).getLatitudeE6() / 1000000.0F);
        j.putFloat("CurrentLon", ((GeoPoint)localObject).getLongitudeE6() / 1000000.0F);
        j.commit();
        i1 = 1;
        continue;
      }
      return true;
      label549:
      i1 = 0;
    }
  }
  
  public int size()
  {
    return l.size();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.MyItemizedOverlay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */