package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.ads.mediation.l;
import com.google.ads.mediation.n;
import com.google.ads.mediation.q;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzfj
  extends zzey.zza
{
  private final i zzCO;
  private final q zzCP;
  
  public zzfj(i parami, q paramq)
  {
    zzCO = parami;
    zzCP = paramq;
  }
  
  private n zzb(String paramString1, int paramInt, String paramString2)
  {
    if (paramString1 != null) {
      try
      {
        localObject = new JSONObject(paramString1);
        paramString2 = new HashMap(((JSONObject)localObject).length());
        Iterator localIterator = ((JSONObject)localObject).keys();
        for (;;)
        {
          paramString1 = paramString2;
          if (!localIterator.hasNext()) {
            break;
          }
          paramString1 = (String)localIterator.next();
          paramString2.put(paramString1, ((JSONObject)localObject).getString(paramString1));
        }
        paramString1 = new HashMap(0);
      }
      catch (Throwable paramString1)
      {
        zzb.zzd("Could not get MediationServerParameters.", paramString1);
        throw new RemoteException();
      }
    }
    Object localObject = zzCO.c();
    paramString2 = null;
    if (localObject != null)
    {
      paramString2 = (n)((Class)localObject).newInstance();
      paramString2.a(paramString1);
    }
    return paramString2;
  }
  
  public final void destroy()
  {
    try
    {
      zzCO.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final Bundle getInterstitialAdapterInfo()
  {
    return new Bundle();
  }
  
  public final zzd getView()
  {
    if (!(zzCO instanceof j))
    {
      zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      zzd localzzd = zze.zzC(((j)zzCO).d());
      return localzzd;
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final boolean isInitialized()
  {
    return true;
  }
  
  public final void pause()
  {
    throw new RemoteException();
  }
  
  public final void resume()
  {
    throw new RemoteException();
  }
  
  public final void showInterstitial()
  {
    if (!(zzCO instanceof l))
    {
      zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Showing interstitial from adapter.");
    try
    {
      ((l)zzCO).e();
      return;
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void showVideo() {}
  
  public final void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2) {}
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2) {}
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    if (!(zzCO instanceof l))
    {
      zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Requesting interstitial ad from adapter.");
    try
    {
      l locall = (l)zzCO;
      paramzzez = new zzfk(paramzzez);
      zze.zzp(paramzzd);
      paramzzd = zzb(paramString1, zztG, paramString2);
      zzfl.zzj(paramAdRequestParcel);
      locall.a(paramzzez, paramzzd, zzCP);
      return;
    }
    catch (Throwable paramzzd)
    {
      zzb.zzd("Could not request interstitial ad from adapter.", paramzzd);
      throw new RemoteException();
    }
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList) {}
  
  public final void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public final void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    if (!(zzCO instanceof j))
    {
      zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Requesting banner ad from adapter.");
    try
    {
      j localj = (j)zzCO;
      paramzzez = new zzfk(paramzzez);
      zze.zzp(paramzzd);
      paramzzd = zzb(paramString1, zztG, paramString2);
      zzfl.zzb(paramAdSizeParcel);
      zzfl.zzj(paramAdRequestParcel);
      localj.a(paramzzez, paramzzd, zzCP);
      return;
    }
    catch (Throwable paramzzd)
    {
      zzb.zzd("Could not request banner ad from adapter.", paramzzd);
      throw new RemoteException();
    }
  }
  
  public final void zzb(AdRequestParcel paramAdRequestParcel, String paramString) {}
  
  public final zzfb zzeF()
  {
    return null;
  }
  
  public final zzfc zzeG()
  {
    return null;
  }
  
  public final Bundle zzeH()
  {
    return new Bundle();
  }
  
  public final Bundle zzeI()
  {
    return new Bundle();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */