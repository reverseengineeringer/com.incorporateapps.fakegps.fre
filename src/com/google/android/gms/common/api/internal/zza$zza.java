package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zza$zza
  extends zzb
  implements zza.zzb, zzj.zze
{
  private final Api.zzc zzaeE;
  private AtomicReference zzagH = new AtomicReference();
  
  protected zza$zza(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super((GoogleApiClient)zzx.zzb(paramGoogleApiClient, "GoogleApiClient must not be null"));
    zzaeE = ((Api.zzc)zzx.zzz(paramzzc));
  }
  
  private void zza(RemoteException paramRemoteException)
  {
    zzw(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  protected abstract void zza(Api.zzb paramzzb);
  
  public void zza(zzj.zzd paramzzd)
  {
    zzagH.set(paramzzd);
  }
  
  public final void zzb(Api.zzb paramzzb)
  {
    try
    {
      zza(paramzzb);
      return;
    }
    catch (DeadObjectException paramzzb)
    {
      zza(paramzzb);
      throw paramzzb;
    }
    catch (RemoteException paramzzb)
    {
      zza(paramzzb);
    }
  }
  
  public final Api.zzc zzoR()
  {
    return zzaeE;
  }
  
  public void zzpe()
  {
    setResultCallback(null);
  }
  
  protected void zzpf()
  {
    zzj.zzd localzzd = (zzj.zzd)zzagH.getAndSet(null);
    if (localzzd != null) {
      localzzd.zzc(this);
    }
  }
  
  public final void zzw(Status paramStatus)
  {
    if (!paramStatus.isSuccess()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Failed result must not be success");
      zza(zzc(paramStatus));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */