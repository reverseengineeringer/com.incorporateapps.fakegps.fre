package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzfu
  extends zzg
{
  private static final zzfu zzFp = new zzfu();
  
  private zzfu()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public static zzfv createAdOverlay(Activity paramActivity)
  {
    try
    {
      zzfv localzzfv1;
      if (!zzb(paramActivity))
      {
        zzfv localzzfv2 = zzFp.zzc(paramActivity);
        localzzfv1 = localzzfv2;
        if (localzzfv2 != null) {}
      }
      else
      {
        zzb.zzaI("Using AdOverlay from the client jar.");
        localzzfv1 = zzn.zzcU().createAdOverlay(paramActivity);
      }
      return localzzfv1;
    }
    catch (zzfu.zza paramActivity)
    {
      zzb.zzaK(paramActivity.getMessage());
    }
    return null;
  }
  
  private static boolean zzb(Activity paramActivity)
  {
    paramActivity = paramActivity.getIntent();
    if (!paramActivity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
      throw new zzfu.zza("Ad overlay requires the useClientJar flag in intent extras.");
    }
    return paramActivity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }
  
  private zzfv zzc(Activity paramActivity)
  {
    try
    {
      zzd localzzd = zze.zzC(paramActivity);
      paramActivity = zzfv.zza.zzL(((zzfw)zzaB(paramActivity)).zze(localzzd));
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      zzb.zzd("Could not create remote AdOverlay.", paramActivity);
      return null;
    }
    catch (zzg.zza paramActivity)
    {
      zzb.zzd("Could not create remote AdOverlay.", paramActivity);
    }
    return null;
  }
  
  protected final zzfw zzK(IBinder paramIBinder)
  {
    return zzfw.zza.zzM(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */