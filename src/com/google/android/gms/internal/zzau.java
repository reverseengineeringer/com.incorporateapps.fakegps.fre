package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class zzau
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final Object zzpV = new Object();
  private boolean zzqJ = false;
  private zziz zzrQ;
  private final WeakReference zzrW;
  private WeakReference zzrX;
  private final zzbb zzrY;
  protected final zzaw zzrZ;
  private final Context zzsa;
  private final WindowManager zzsb;
  private final PowerManager zzsc;
  private final KeyguardManager zzsd;
  private zzay zzse;
  private boolean zzsf;
  private boolean zzsg = false;
  private boolean zzsh;
  private boolean zzsi;
  private boolean zzsj;
  BroadcastReceiver zzsk;
  private final HashSet zzsl = new HashSet();
  private final zzdf zzsm = new zzau.2(this);
  private final zzdf zzsn = new zzau.3(this);
  private final zzdf zzso = new zzau.4(this);
  
  public zzau(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb)
  {
    zzrW = new WeakReference(paramzzif);
    zzrY = paramzzbb;
    zzrX = new WeakReference(null);
    zzsh = true;
    zzsj = false;
    zzrQ = new zziz(200L);
    zzrZ = new zzaw(UUID.randomUUID().toString(), paramVersionInfoParcel, zzuh, zzKT, paramzzif.zzcv(), zzuk);
    zzsb = ((WindowManager)paramContext.getSystemService("window"));
    zzsc = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    zzsd = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    zzsa = paramContext;
  }
  
  protected void destroy()
  {
    synchronized (zzpV)
    {
      zzcj();
      zzce();
      zzsh = false;
      zzcg();
      return;
    }
  }
  
  boolean isScreenOn()
  {
    return zzsc.isScreenOn();
  }
  
  public void onGlobalLayout()
  {
    zzh(false);
  }
  
  public void onScrollChanged()
  {
    zzh(true);
  }
  
  public void pause()
  {
    synchronized (zzpV)
    {
      zzqJ = true;
      zzh(false);
      return;
    }
  }
  
  public void resume()
  {
    synchronized (zzpV)
    {
      zzqJ = false;
      zzh(false);
      return;
    }
  }
  
  public void stop()
  {
    synchronized (zzpV)
    {
      zzsg = true;
      zzh(false);
      return;
    }
  }
  
  protected int zza(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f = density;
    return (int)(paramInt / f);
  }
  
  protected void zza(View paramView, Map paramMap)
  {
    zzh(false);
  }
  
  public void zza(zzav paramzzav)
  {
    zzsl.add(paramzzav);
  }
  
  public void zza(zzay paramzzay)
  {
    synchronized (zzpV)
    {
      zzse = paramzzay;
      return;
    }
  }
  
  protected void zza(JSONObject paramJSONObject)
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      JSONObject localJSONObject = new JSONObject();
      localJSONArray.put(paramJSONObject);
      localJSONObject.put("units", localJSONArray);
      zzb(localJSONObject);
      return;
    }
    catch (Throwable paramJSONObject)
    {
      zzin.zzb("Skipping active view message.", paramJSONObject);
    }
  }
  
  protected void zzb(zzeh paramzzeh)
  {
    paramzzeh.zza("/updateActiveView", zzsm);
    paramzzeh.zza("/untrackActiveViewUnit", zzsn);
    paramzzeh.zza("/visibilityChanged", zzso);
  }
  
  protected abstract void zzb(JSONObject paramJSONObject);
  
  protected boolean zzb(Map paramMap)
  {
    if (paramMap == null) {
      return false;
    }
    paramMap = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(paramMap)) && (paramMap.equals(zzrZ.zzcu()));
  }
  
  protected void zzc(zzeh paramzzeh)
  {
    paramzzeh.zzb("/visibilityChanged", zzso);
    paramzzeh.zzb("/untrackActiveViewUnit", zzsn);
    paramzzeh.zzb("/updateActiveView", zzsm);
  }
  
  protected void zzcd()
  {
    synchronized (zzpV)
    {
      if (zzsk != null) {
        return;
      }
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      zzsk = new zzau.1(this);
      zzsa.registerReceiver(zzsk, localIntentFilter);
      return;
    }
  }
  
  protected void zzce()
  {
    synchronized (zzpV)
    {
      BroadcastReceiver localBroadcastReceiver = zzsk;
      if (localBroadcastReceiver == null) {}
    }
    try
    {
      zzsa.unregisterReceiver(zzsk);
      zzsk = null;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        zzin.zzb("Failed trying to unregister the receiver", localIllegalStateException);
      }
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        zzr.zzbF().zzb(localException, true);
      }
    }
  }
  
  public void zzcf()
  {
    synchronized (zzpV)
    {
      if (zzsh) {
        zzsi = true;
      }
    }
    try
    {
      zza(zzcn());
      zzin.zzaI("Untracking ad unit: " + zzrZ.zzcu());
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        zzin.zzb("JSON failure while processing active view data.", localJSONException);
      }
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        zzin.zzb("Failure while processing active view data.", localRuntimeException);
      }
    }
  }
  
  protected void zzcg()
  {
    if (zzse != null) {
      zzse.zza(this);
    }
  }
  
  public boolean zzch()
  {
    synchronized (zzpV)
    {
      boolean bool = zzsh;
      return bool;
    }
  }
  
  protected void zzci()
  {
    Object localObject = zzrY.zzcq().zzco();
    if (localObject == null) {}
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = (ViewTreeObserver)zzrX.get();
      localObject = ((View)localObject).getViewTreeObserver();
    } while (localObject == localViewTreeObserver);
    zzcj();
    if ((!zzsf) || ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive())))
    {
      zzsf = true;
      ((ViewTreeObserver)localObject).addOnScrollChangedListener(this);
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
    }
    zzrX = new WeakReference(localObject);
  }
  
  protected void zzcj()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)zzrX.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive())) {
      return;
    }
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }
  
  protected JSONObject zzck()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", zzrZ.zzcs()).put("activeViewJSON", zzrZ.zzct()).put("timestamp", zzr.zzbG().elapsedRealtime()).put("adFormat", zzrZ.zzcr()).put("hashCode", zzrZ.zzcu()).put("isMraid", zzrZ.zzcv()).put("isStopped", zzsg).put("isPaused", zzqJ).put("isScreenOn", isScreenOn()).put("isNative", zzrZ.zzcw());
    return localJSONObject;
  }
  
  protected abstract boolean zzcl();
  
  protected JSONObject zzcm()
  {
    return zzck().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
  }
  
  protected JSONObject zzcn()
  {
    JSONObject localJSONObject = zzck();
    localJSONObject.put("doneReasonCode", "u");
    return localJSONObject;
  }
  
  protected JSONObject zzd(View paramView)
  {
    if (paramView == null) {
      return zzcm();
    }
    boolean bool1 = zzr.zzbE().isAttachedToWindow(paramView);
    Object localObject2 = new int[2];
    Object localObject1 = new int[2];
    try
    {
      paramView.getLocationOnScreen((int[])localObject2);
      paramView.getLocationInWindow((int[])localObject1);
      localObject1 = paramView.getContext().getResources().getDisplayMetrics();
      Rect localRect1 = new Rect();
      left = localObject2[0];
      top = localObject2[1];
      right = (left + paramView.getWidth());
      bottom = (top + paramView.getHeight());
      localObject2 = new Rect();
      right = zzsb.getDefaultDisplay().getWidth();
      bottom = zzsb.getDefaultDisplay().getHeight();
      Rect localRect2 = new Rect();
      boolean bool2 = paramView.getGlobalVisibleRect(localRect2, null);
      Rect localRect3 = new Rect();
      boolean bool3 = paramView.getLocalVisibleRect(localRect3);
      Rect localRect4 = new Rect();
      paramView.getHitRect(localRect4);
      JSONObject localJSONObject = zzck();
      localJSONObject.put("windowVisibility", paramView.getWindowVisibility()).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", zza(top, (DisplayMetrics)localObject1)).put("bottom", zza(bottom, (DisplayMetrics)localObject1)).put("left", zza(left, (DisplayMetrics)localObject1)).put("right", zza(right, (DisplayMetrics)localObject1))).put("adBox", new JSONObject().put("top", zza(top, (DisplayMetrics)localObject1)).put("bottom", zza(bottom, (DisplayMetrics)localObject1)).put("left", zza(left, (DisplayMetrics)localObject1)).put("right", zza(right, (DisplayMetrics)localObject1))).put("globalVisibleBox", new JSONObject().put("top", zza(top, (DisplayMetrics)localObject1)).put("bottom", zza(bottom, (DisplayMetrics)localObject1)).put("left", zza(left, (DisplayMetrics)localObject1)).put("right", zza(right, (DisplayMetrics)localObject1))).put("globalVisibleBoxVisible", bool2).put("localVisibleBox", new JSONObject().put("top", zza(top, (DisplayMetrics)localObject1)).put("bottom", zza(bottom, (DisplayMetrics)localObject1)).put("left", zza(left, (DisplayMetrics)localObject1)).put("right", zza(right, (DisplayMetrics)localObject1))).put("localVisibleBoxVisible", bool3).put("hitBox", new JSONObject().put("top", zza(top, (DisplayMetrics)localObject1)).put("bottom", zza(bottom, (DisplayMetrics)localObject1)).put("left", zza(left, (DisplayMetrics)localObject1)).put("right", zza(right, (DisplayMetrics)localObject1))).put("screenDensity", density).put("isVisible", zzr.zzbC().zza(paramView, zzsc, zzsd));
      return localJSONObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        zzin.zzb("Failure getting view location.", localException);
      }
    }
  }
  
  protected void zzg(boolean paramBoolean)
  {
    Iterator localIterator = zzsl.iterator();
    while (localIterator.hasNext()) {
      ((zzav)localIterator.next()).zza(this, paramBoolean);
    }
  }
  
  protected void zzh(boolean paramBoolean)
  {
    boolean bool;
    for (;;)
    {
      synchronized (zzpV)
      {
        if ((!zzcl()) || (!zzsh)) {
          return;
        }
        View localView1 = zzrY.zzco();
        if ((localView1 != null) && (zzr.zzbC().zza(localView1, zzsc, zzsd)) && (localView1.getGlobalVisibleRect(new Rect(), null)))
        {
          bool = true;
          if ((!paramBoolean) || (zzrQ.tryAcquire()) || (bool != zzsj)) {
            break;
          }
          return;
        }
      }
      bool = false;
    }
    zzsj = bool;
    if (zzrY.zzcp())
    {
      zzcf();
      return;
    }
    for (;;)
    {
      try
      {
        zza(zzd(localView2));
        zzci();
        zzcg();
        return;
      }
      catch (JSONException localJSONException)
      {
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        continue;
      }
      zzin.zza("Active view update failed.", localView2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzau
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */