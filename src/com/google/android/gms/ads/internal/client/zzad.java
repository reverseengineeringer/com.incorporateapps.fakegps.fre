package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzew;

public class zzad
{
  private static final Object zzqy = new Object();
  private static zzad zzuV;
  private zzy zzuW;
  private RewardedVideoAd zzuX;
  
  public static zzad zzdi()
  {
    synchronized (zzqy)
    {
      if (zzuV == null) {
        zzuV = new zzad();
      }
      zzad localzzad = zzuV;
      return localzzad;
    }
  }
  
  public RewardedVideoAd getRewardedVideoAdInstance(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzuX != null)
      {
        paramContext = zzuX;
        return paramContext;
      }
      zzew localzzew = new zzew();
      zzuX = new zzi(paramContext, zzn.zzcX().zza(paramContext, localzzew));
      paramContext = zzuX;
      return paramContext;
    }
  }
  
  public void initialize(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzuW != null) {
        return;
      }
      if (paramContext == null) {
        throw new IllegalArgumentException("Context cannot be null.");
      }
    }
    try
    {
      zzuW = zzn.zzcV().zzu(paramContext);
      zzuW.zza();
      return;
    }
    catch (RemoteException paramContext)
    {
      for (;;)
      {
        zzb.zzaK("Fail to initialize mobile ads setting manager");
      }
    }
  }
  
  public void setAppVolume(float paramFloat)
  {
    boolean bool2 = true;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F))
    {
      bool1 = true;
      zzx.zzb(bool1, "The app volume must be a value between 0 and 1 inclusive.");
      if (zzuW == null) {
        break label53;
      }
    }
    label53:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "MobileAds.initialize() must be called prior to setting the app volume.");
      try
      {
        zzuW.setAppVolume(paramFloat);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzb.zzb("Unable to set app volume.", localRemoteException);
      }
      bool1 = false;
      break;
    }
  }
  
  public void zza(Context paramContext, String paramString, zzae paramzzae)
  {
    initialize(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */