package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzrn;

class zzh$zze
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private zzh$zze(zzh paramzzh) {}
  
  public void onConnected(Bundle paramBundle)
  {
    zzh.zzf(zzahC).zza(new zzh.zzd(zzahC));
  }
  
  /* Error */
  public void onConnectionFailed(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   4: invokestatic 44	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 49 1 0
    //   12: aload_0
    //   13: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   16: aload_1
    //   17: invokestatic 53	com/google/android/gms/common/api/internal/zzh:zzb	(Lcom/google/android/gms/common/api/internal/zzh;Lcom/google/android/gms/common/ConnectionResult;)Z
    //   20: ifeq +30 -> 50
    //   23: aload_0
    //   24: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   27: invokestatic 56	com/google/android/gms/common/api/internal/zzh:zzi	(Lcom/google/android/gms/common/api/internal/zzh;)V
    //   30: aload_0
    //   31: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   34: invokestatic 59	com/google/android/gms/common/api/internal/zzh:zzj	(Lcom/google/android/gms/common/api/internal/zzh;)V
    //   37: aload_0
    //   38: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   41: invokestatic 44	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   44: invokeinterface 62 1 0
    //   49: return
    //   50: aload_0
    //   51: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   54: aload_1
    //   55: invokestatic 65	com/google/android/gms/common/api/internal/zzh:zza	(Lcom/google/android/gms/common/api/internal/zzh;Lcom/google/android/gms/common/ConnectionResult;)V
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 14	com/google/android/gms/common/api/internal/zzh$zze:zzahC	Lcom/google/android/gms/common/api/internal/zzh;
    //   66: invokestatic 44	com/google/android/gms/common/api/internal/zzh:zzc	(Lcom/google/android/gms/common/api/internal/zzh;)Ljava/util/concurrent/locks/Lock;
    //   69: invokeinterface 62 1 0
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	zze
    //   0	76	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    // Exception table:
    //   from	to	target	type
    //   12	37	61	finally
    //   50	58	61	finally
  }
  
  public void onConnectionSuspended(int paramInt) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */