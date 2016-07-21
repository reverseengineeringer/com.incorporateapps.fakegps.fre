package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzkm
  extends zzj
{
  private final String zzUW;
  
  public zzkm(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, 77, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzUW = paramzzf.zzqv();
  }
  
  private Bundle zzmm()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("authPackage", zzUW);
    return localBundle;
  }
  
  public void zza(zzko paramzzko)
  {
    try
    {
      ((zzkp)zzqJ()).zza(paramzzko);
      return;
    }
    catch (RemoteException paramzzko) {}
  }
  
  public void zza(zzko paramzzko, String paramString)
  {
    try
    {
      ((zzkp)zzqJ()).zza(paramzzko, paramString);
      return;
    }
    catch (RemoteException paramzzko) {}
  }
  
  protected zzkp zzaj(IBinder paramIBinder)
  {
    return zzkp.zza.zzal(paramIBinder);
  }
  
  public void zzb(zzko paramzzko, String paramString)
  {
    try
    {
      ((zzkp)zzqJ()).zzb(paramzzko, paramString);
      return;
    }
    catch (RemoteException paramzzko) {}
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.appinvite.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.appinvite.internal.IAppInviteService";
  }
  
  protected Bundle zzml()
  {
    return zzmm();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */