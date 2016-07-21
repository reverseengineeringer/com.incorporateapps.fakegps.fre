package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.internal.zzew;

public class zze
  extends zzg
{
  public zze()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  private zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, int paramInt)
  {
    try
    {
      zzd localzzd = com.google.android.gms.dynamic.zze.zzC(paramContext);
      paramContext = zzu.zza.zzk(((zzv)zzaB(paramContext)).zza(localzzd, paramAdSizeParcel, paramString, paramzzew, 8487000, paramInt));
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      zzb.zza("Could not create remote AdManager.", paramContext);
      return null;
    }
    catch (zzg.zza paramContext)
    {
      for (;;) {}
    }
  }
  
  public zzu zza(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    Object localObject;
    if (zzn.zzcS().zzU(paramContext))
    {
      zzu localzzu = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, 1);
      localObject = localzzu;
      if (localzzu != null) {}
    }
    else
    {
      zzb.zzaI("Using BannerAdManager from the client jar.");
      localObject = new VersionInfoParcel(8487000, 8487000, true);
      localObject = zzn.zzcU().createBannerAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, (VersionInfoParcel)localObject);
    }
    return (zzu)localObject;
  }
  
  public zzu zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew)
  {
    Object localObject;
    if (zzn.zzcS().zzU(paramContext))
    {
      zzu localzzu = zza(paramContext, paramAdSizeParcel, paramString, paramzzew, 2);
      localObject = localzzu;
      if (localzzu != null) {}
    }
    else
    {
      zzb.zzaK("Using InterstitialAdManager from the client jar.");
      localObject = new VersionInfoParcel(8487000, 8487000, true);
      localObject = zzn.zzcU().createInterstitialAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, (VersionInfoParcel)localObject);
    }
    return (zzu)localObject;
  }
  
  protected zzv zze(IBinder paramIBinder)
  {
    return zzv.zza.zzl(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */