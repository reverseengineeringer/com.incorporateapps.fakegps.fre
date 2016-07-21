package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class zzsf
  extends zzg
{
  private static zzsf zzbqD;
  
  protected zzsf()
  {
    super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
  }
  
  private static zzsf zzIq()
  {
    if (zzbqD == null) {
      zzbqD = new zzsf();
    }
    return zzbqD;
  }
  
  public static zzrx zza(Activity paramActivity, zzc paramzzc, WalletFragmentOptions paramWalletFragmentOptions, zzry paramzzry)
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramActivity);
    if (i != 0) {
      throw new GooglePlayServicesNotAvailableException(i);
    }
    try
    {
      paramActivity = ((zzsa)zzIq().zzaB(paramActivity)).zza(zze.zzC(paramActivity), paramzzc, paramWalletFragmentOptions, paramzzry);
      return paramActivity;
    }
    catch (RemoteException paramActivity)
    {
      throw new RuntimeException(paramActivity);
    }
    catch (zzg.zza paramActivity)
    {
      throw new RuntimeException(paramActivity);
    }
  }
  
  protected zzsa zzeq(IBinder paramIBinder)
  {
    return zzsa.zza.zzem(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */