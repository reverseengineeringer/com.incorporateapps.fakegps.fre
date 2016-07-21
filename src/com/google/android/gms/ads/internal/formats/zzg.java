package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import org.json.JSONObject;

public class zzg
  extends zzi
{
  private Object zzpV = new Object();
  private zzfb zzyl;
  private zzfc zzym;
  private final zzp zzyn;
  private zzh zzyo;
  private boolean zzyp = false;
  
  private zzg(Context paramContext, zzp paramzzp, zzan paramzzan)
  {
    super(paramContext, paramzzp, null, paramzzan, null, null, null);
    zzyn = paramzzp;
  }
  
  public zzg(Context paramContext, zzp paramzzp, zzan paramzzan, zzfb paramzzfb)
  {
    this(paramContext, paramzzp, paramzzan);
    zzyl = paramzzfb;
  }
  
  public zzg(Context paramContext, zzp paramzzp, zzan paramzzan, zzfc paramzzfc)
  {
    this(paramContext, paramzzp, paramzzan);
    zzym = paramzzfc;
  }
  
  public void recordImpression()
  {
    zzx.zzcD("recordImpression must be called on the main UI thread.");
    for (;;)
    {
      synchronized (zzpV)
      {
        zzn(true);
        if (zzyo != null)
        {
          zzyo.recordImpression();
          zzyn.recordImpression();
          return;
        }
        try
        {
          if ((zzyl != null) && (!zzyl.getOverrideImpressionRecording())) {
            zzyl.recordImpression();
          }
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Failed to call recordImpression", localRemoteException);
        }
      }
      if ((zzym != null) && (!zzym.getOverrideImpressionRecording())) {
        zzym.recordImpression();
      }
    }
  }
  
  public zzb zza(View.OnClickListener paramOnClickListener)
  {
    return null;
  }
  
  public void zza(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    synchronized (zzpV)
    {
      if (zzyo != null)
      {
        zzyo.zza(paramView, paramMap, paramJSONObject1, paramJSONObject2, paramJSONObject3);
        zzyn.onAdClicked();
      }
      for (;;)
      {
        return;
        try
        {
          if ((zzyl != null) && (!zzyl.getOverrideClickHandling()))
          {
            zzyl.zzc(zze.zzC(paramView));
            zzyn.onAdClicked();
          }
          if ((zzym == null) || (zzym.getOverrideClickHandling())) {
            continue;
          }
          zzym.zzc(zze.zzC(paramView));
          zzyn.onAdClicked();
        }
        catch (RemoteException paramView)
        {
          zzin.zzd("Failed to call performClick", paramView);
        }
      }
    }
  }
  
  public void zzc(zzh paramzzh)
  {
    synchronized (zzpV)
    {
      zzyo = paramzzh;
      return;
    }
  }
  
  public boolean zzdP()
  {
    synchronized (zzpV)
    {
      boolean bool = zzyp;
      return bool;
    }
  }
  
  public zzh zzdQ()
  {
    synchronized (zzpV)
    {
      zzh localzzh = zzyo;
      return localzzh;
    }
  }
  
  public zzjp zzdR()
  {
    return null;
  }
  
  public void zzg(View paramView)
  {
    synchronized (zzpV)
    {
      zzyp = true;
      try
      {
        if (zzyl != null) {
          zzyl.zzd(zze.zzC(paramView));
        }
        for (;;)
        {
          zzyp = false;
          return;
          if (zzym != null) {
            zzym.zzd(zze.zzC(paramView));
          }
        }
      }
      catch (RemoteException paramView)
      {
        for (;;)
        {
          zzin.zzd("Failed to call prepareAd", paramView);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */