package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzk
  extends zzcj.zza
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private FrameLayout zzoQ;
  private final Object zzpV = new Object();
  private final FrameLayout zzyD;
  private Map zzyE = new HashMap();
  private zzb zzyF;
  boolean zzyG = false;
  int zzyH;
  int zzyI;
  private zzh zzyf;
  
  public zzk(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    zzyD = paramFrameLayout1;
    zzoQ = paramFrameLayout2;
    zzjk.zza(zzyD, this);
    zzjk.zza(zzyD, this);
    zzyD.setOnTouchListener(this);
  }
  
  public void destroy()
  {
    zzoQ.removeAllViews();
    zzoQ = null;
    zzyE = null;
    zzyF = null;
    zzyf = null;
  }
  
  int getMeasuredHeight()
  {
    return zzyD.getMeasuredHeight();
  }
  
  int getMeasuredWidth()
  {
    return zzyD.getMeasuredWidth();
  }
  
  public void onClick(View paramView)
  {
    JSONObject localJSONObject1;
    Object localObject3;
    synchronized (zzpV)
    {
      if (zzyf == null) {
        return;
      }
      localJSONObject1 = new JSONObject();
      localObject2 = zzyE.entrySet().iterator();
      for (;;)
      {
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          View localView = (View)((WeakReference)((Map.Entry)localObject3).getValue()).get();
          Point localPoint = zzj(localView);
          JSONObject localJSONObject2 = new JSONObject();
          try
          {
            localJSONObject2.put("width", zzq(localView.getWidth()));
            localJSONObject2.put("height", zzq(localView.getHeight()));
            localJSONObject2.put("x", zzq(x));
            localJSONObject2.put("y", zzq(y));
            localJSONObject1.put((String)((Map.Entry)localObject3).getKey(), localJSONObject2);
          }
          catch (JSONException localJSONException2)
          {
            zzin.zzaK("Unable to get view rectangle for view " + (String)((Map.Entry)localObject3).getKey());
          }
        }
      }
    }
    Object localObject2 = new JSONObject();
    try
    {
      ((JSONObject)localObject2).put("x", zzq(zzyH));
      ((JSONObject)localObject2).put("y", zzq(zzyI));
      localObject3 = new JSONObject();
    }
    catch (JSONException localJSONException1)
    {
      try
      {
        ((JSONObject)localObject3).put("width", zzq(getMeasuredWidth()));
        ((JSONObject)localObject3).put("height", zzq(getMeasuredHeight()));
        if ((zzyF != null) && (zzyF.zzdI().equals(paramView)))
        {
          zzyf.zza("1007", localJSONObject1, (JSONObject)localObject2, (JSONObject)localObject3);
          return;
          localJSONException1 = localJSONException1;
          zzin.zzaK("Unable to get click location");
        }
      }
      catch (JSONException localJSONException3)
      {
        for (;;)
        {
          zzin.zzaK("Unable to get native ad view bounding box");
          continue;
          zzyf.zza(paramView, zzyE, localJSONObject1, (JSONObject)localObject2, localJSONException1);
        }
      }
    }
  }
  
  public void onGlobalLayout()
  {
    synchronized (zzpV)
    {
      if (zzyG)
      {
        int i = getMeasuredWidth();
        int j = getMeasuredHeight();
        if ((i != 0) && (j != 0))
        {
          zzoQ.setLayoutParams(new FrameLayout.LayoutParams(i, j));
          zzyG = false;
        }
      }
      if (zzyf != null) {
        zzyf.zzh(zzyD);
      }
      return;
    }
  }
  
  public void onScrollChanged()
  {
    synchronized (zzpV)
    {
      if (zzyf != null) {
        zzyf.zzh(zzyD);
      }
      return;
    }
  }
  
  public boolean onTouch(View arg1, MotionEvent paramMotionEvent)
  {
    synchronized (zzpV)
    {
      if (zzyf == null) {
        return false;
      }
      Point localPoint = zzc(paramMotionEvent);
      zzyH = x;
      zzyI = y;
      paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
      paramMotionEvent.setLocation(x, y);
      zzyf.zzb(paramMotionEvent);
      paramMotionEvent.recycle();
      return false;
    }
  }
  
  public zzd zzK(String paramString)
  {
    synchronized (zzpV)
    {
      paramString = (WeakReference)zzyE.get(paramString);
      if (paramString == null)
      {
        paramString = null;
        paramString = zze.zzC(paramString);
        return paramString;
      }
      paramString = (View)paramString.get();
    }
  }
  
  public void zza(zzd paramzzd)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        zzyG = true;
        zzi(null);
        paramzzd = zze.zzp(paramzzd);
        if (!(paramzzd instanceof zzi))
        {
          zzin.zzaK("Not an instance of native engine. This is most likely a transient error");
          return;
        }
        paramzzd = (zzi)paramzzd;
        if (((zzyf instanceof zzg)) && (((zzg)zzyf).zzdP()))
        {
          ((zzg)zzyf).zzc(paramzzd);
          zzoQ.removeAllViews();
          zzyF = zzd(paramzzd);
          if (zzyF != null)
          {
            zzyE.put("1007", new WeakReference(zzyF.zzdI()));
            zzoQ.addView(zzyF);
          }
          zzir.zzMc.post(new zzk.1(this, paramzzd));
          paramzzd.zzg(zzyD);
          zzi(zzyD);
          return;
        }
      }
      zzyf = paramzzd;
      if ((zzyf instanceof zzg)) {
        ((zzg)zzyf).zzc(null);
      }
    }
  }
  
  public void zza(String paramString, zzd paramzzd)
  {
    View localView = (View)zze.zzp(paramzzd);
    paramzzd = zzpV;
    if (localView == null) {}
    for (;;)
    {
      try
      {
        zzyE.remove(paramString);
        return;
      }
      finally {}
      zzyE.put(paramString, new WeakReference(localView));
      localView.setOnTouchListener(this);
      localView.setOnClickListener(this);
    }
  }
  
  Point zzc(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    zzyD.getLocationOnScreen(arrayOfInt);
    float f1 = paramMotionEvent.getRawX();
    float f2 = arrayOfInt[0];
    float f3 = paramMotionEvent.getRawY();
    float f4 = arrayOfInt[1];
    return new Point((int)(f1 - f2), (int)(f3 - f4));
  }
  
  zzb zzd(zzi paramzzi)
  {
    return paramzzi.zza(this);
  }
  
  void zzi(View paramView)
  {
    if (zzyf != null) {
      if (!(zzyf instanceof zzg)) {
        break label40;
      }
    }
    label40:
    for (zzh localzzh = ((zzg)zzyf).zzdQ();; localzzh = zzyf)
    {
      if (localzzh != null) {
        localzzh.zzi(paramView);
      }
      return;
    }
  }
  
  Point zzj(View paramView)
  {
    if ((zzyF != null) && (zzyF.zzdI().equals(paramView)))
    {
      localPoint1 = new Point();
      zzyD.getGlobalVisibleRect(new Rect(), localPoint1);
      Point localPoint2 = new Point();
      paramView.getGlobalVisibleRect(new Rect(), localPoint2);
      return new Point(x - x, y - y);
    }
    Point localPoint1 = new Point();
    paramView.getGlobalVisibleRect(new Rect(), localPoint1);
    return localPoint1;
  }
  
  int zzq(int paramInt)
  {
    return zzn.zzcS().zzc(zzyf.getContext(), paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */