package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzgj
  extends zzg
{
  private static final zzgj zzGa = new zzgj();
  
  private zzgj()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }
  
  public static zzge createInAppPurchaseManager(Activity paramActivity)
  {
    try
    {
      zzge localzzge1;
      if (!zzb(paramActivity))
      {
        zzge localzzge2 = zzGa.zzd(paramActivity);
        localzzge1 = localzzge2;
        if (localzzge2 != null) {}
      }
      else
      {
        zzin.zzaI("Using AdOverlay from the client jar.");
        localzzge1 = zzn.zzcU().createInAppPurchaseManager(paramActivity);
      }
      return localzzge1;
    }
    catch (zzgj.zza paramActivity)
    {
      zzin.zzaK(paramActivity.getMessage());
    }
    return null;
  }
  
  private static boolean zzb(Activity paramActivity)
  {
    paramActivity = paramActivity.getIntent();
    if (!paramActivity.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
      throw new zzgj.zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    }
    return paramActivity.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
  }
  
  private zzge zzd(Activity paramActivity)
  {
    try
    {
      zzd localzzd = zze.zzC(paramActivity);
      paramActivity = zzge.zza.zzQ(((zzgf)zzaB(paramActivity)).zzf(localzzd));
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      zzin.zzd("Could not create remote InAppPurchaseManager.", paramActivity);
      return null;
    }
    catch (zzg.zza paramActivity)
    {
      zzin.zzd("Could not create remote InAppPurchaseManager.", paramActivity);
    }
    return null;
  }
  
  protected final zzgf zzU(IBinder paramIBinder)
  {
    return zzgf.zza.zzR(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */