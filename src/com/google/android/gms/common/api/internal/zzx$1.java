package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import java.lang.ref.WeakReference;

class zzx$1
  implements Runnable
{
  zzx$1(zzx paramzzx, Result paramResult) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = zzx.zzc(zzaiU).onSuccess(zzaiT);
      zzx.zzd(zzaiU).sendMessage(zzx.zzd(zzaiU).obtainMessage(0, localObject1));
      zzx.zza(zzaiU, zzaiT);
      localObject1 = (GoogleApiClient)zzx.zze(zzaiU).get();
      if (localObject1 != null) {
        ((GoogleApiClient)localObject1).zzb(zzaiU);
      }
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzx.zzd(zzaiU).sendMessage(zzx.zzd(zzaiU).obtainMessage(1, localRuntimeException));
      GoogleApiClient localGoogleApiClient1;
      return;
    }
    finally
    {
      zzx.zza(zzaiU, zzaiT);
      GoogleApiClient localGoogleApiClient2 = (GoogleApiClient)zzx.zze(zzaiU).get();
      if (localGoogleApiClient2 != null) {
        localGoogleApiClient2.zzb(zzaiU);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzx.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */