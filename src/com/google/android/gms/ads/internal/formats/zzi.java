package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzi
  implements zzh
{
  private final Context mContext;
  private zzjp zzpD;
  private final VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  private final zzp zzyn;
  private final JSONObject zzyq;
  private final zzed zzyr;
  private final zzh.zza zzys;
  private final zzan zzyt;
  private boolean zzyu;
  private String zzyv;
  private WeakReference zzyw = null;
  
  public zzi(Context paramContext, zzp paramzzp, zzed paramzzed, zzan paramzzan, JSONObject paramJSONObject, zzh.zza paramzza, VersionInfoParcel paramVersionInfoParcel)
  {
    mContext = paramContext;
    zzyn = paramzzp;
    zzyr = paramzzed;
    zzyt = paramzzan;
    zzyq = paramJSONObject;
    zzys = paramzza;
    zzpT = paramVersionInfoParcel;
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  public void recordImpression()
  {
    zzx.zzcD("recordImpression must be called on the main UI thread.");
    zzn(true);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", zzyq);
      zzyr.zza("google.afma.nativeAds.handleImpressionPing", localJSONObject);
      zzyn.zza(this);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        zzin.zzb("Unable to create impression JSON.", localJSONException);
      }
    }
  }
  
  public zzb zza(View.OnClickListener paramOnClickListener)
  {
    Object localObject = zzys.zzdN();
    if (localObject == null) {
      return null;
    }
    localObject = new zzb(mContext, (zza)localObject);
    ((zzb)localObject).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    ((zzb)localObject).zzdI().setOnClickListener(paramOnClickListener);
    ((zzb)localObject).zzdI().setContentDescription("Ad attribution icon");
    return (zzb)localObject;
  }
  
  public void zza(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (paramView.equals((View)((WeakReference)localEntry.getValue()).get())) {
        zza((String)localEntry.getKey(), paramJSONObject1, paramJSONObject2, paramJSONObject3);
      }
    }
  }
  
  public void zza(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("asset", paramString);
      localJSONObject.put("template", zzys.zzdM());
      paramString = new JSONObject();
      paramString.put("ad", zzyq);
      paramString.put("click", localJSONObject);
      if (zzyn.zzs(zzys.getCustomTemplateId()) != null) {}
      for (boolean bool = true;; bool = false)
      {
        paramString.put("has_custom_click_handler", bool);
        if (paramJSONObject1 != null) {
          paramString.put("view_rectangles", paramJSONObject1);
        }
        if (paramJSONObject2 != null) {
          paramString.put("click_point", paramJSONObject2);
        }
        if (paramJSONObject3 != null) {
          paramString.put("native_view_rectangle", paramJSONObject3);
        }
        zzyr.zza("google.afma.nativeAds.handleClickGmsg", paramString);
        return;
      }
      return;
    }
    catch (JSONException paramString)
    {
      zzin.zzb("Unable to create click JSON.", paramString);
    }
  }
  
  public void zzb(MotionEvent paramMotionEvent)
  {
    zzyt.zza(paramMotionEvent);
  }
  
  public zzjp zzdR()
  {
    zzpD = zzdT();
    zzpD.getView().setVisibility(8);
    zzyr.zza("/loadHtml", new zzi.1(this));
    zzyr.zza("/showOverlay", new zzi.2(this));
    zzyr.zza("/hideOverlay", new zzi.3(this));
    zzpD.zzhU().zza("/hideOverlay", new zzi.4(this));
    zzpD.zzhU().zza("/sendMessageToSdk", new zzi.5(this));
    return zzpD;
  }
  
  public View zzdS()
  {
    if (zzyw != null) {
      return (View)zzyw.get();
    }
    return null;
  }
  
  zzjp zzdT()
  {
    return zzr.zzbD().zza(mContext, AdSizeParcel.zzt(mContext), false, false, zzyt, zzpT);
  }
  
  public void zzg(View paramView) {}
  
  public void zzh(View paramView)
  {
    synchronized (zzpV)
    {
      if (zzyu) {
        return;
      }
      if (!paramView.isShown()) {
        return;
      }
    }
    if (!paramView.getGlobalVisibleRect(new Rect(), null)) {
      return;
    }
    recordImpression();
  }
  
  public void zzi(View paramView)
  {
    zzyw = new WeakReference(paramView);
  }
  
  protected void zzn(boolean paramBoolean)
  {
    zzyu = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */