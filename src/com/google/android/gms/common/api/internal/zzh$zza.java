package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

class zzh$zza
  implements GoogleApiClient.zza
{
  private final Api zzagT;
  private final int zzagU;
  private final WeakReference zzahD;
  
  public zzh$zza(zzh paramzzh, Api paramApi, int paramInt)
  {
    zzahD = new WeakReference(paramzzh);
    zzagT = paramApi;
    zzagU = paramInt;
  }
  
  public void zza(ConnectionResult paramConnectionResult)
  {
    boolean bool = false;
    zzh localzzh = (zzh)zzahD.get();
    if (localzzh == null) {
      return;
    }
    if (Looper.myLooper() == zzdzzagW.getLooper()) {
      bool = true;
    }
    zzx.zza(bool, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
    zzh.zzc(localzzh).lock();
    try
    {
      bool = zzh.zza(localzzh, 0);
      if (!bool) {
        return;
      }
      if (!paramConnectionResult.isSuccess()) {
        zzh.zza(localzzh, paramConnectionResult, zzagT, zzagU);
      }
      if (zzh.zzk(localzzh)) {
        zzh.zzj(localzzh);
      }
      return;
    }
    finally
    {
      zzh.zzc(localzzh).unlock();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */