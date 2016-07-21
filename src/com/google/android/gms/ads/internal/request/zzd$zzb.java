package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzji;

public class zzd$zzb
  extends zzd
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private Context mContext;
  private zzji zzHl;
  private final zzc.zza zzHm;
  protected zze zzHp;
  private boolean zzHq;
  private VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  
  public zzd$zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    super(paramzzji, paramzza);
    mContext = paramContext;
    zzpT = paramVersionInfoParcel;
    zzHl = paramzzji;
    zzHm = paramzza;
    if (((Boolean)zzbt.zzwa.get()).booleanValue()) {
      zzHq = true;
    }
    for (paramVersionInfoParcel = zzr.zzbO().zzhC();; paramVersionInfoParcel = paramContext.getMainLooper())
    {
      zzHp = new zze(paramContext, paramVersionInfoParcel, this, this, zzpT.zzNa);
      connect();
      return;
    }
  }
  
  protected void connect()
  {
    zzHp.zzqG();
  }
  
  public void onConnected(Bundle paramBundle)
  {
    zzga();
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzin.zzaI("Cannot connect to remote service, fallback to local instance.");
    zzgt().zzgd();
    paramConnectionResult = new Bundle();
    paramConnectionResult.putString("action", "gms_connection_failed_fallback_to_local");
    zzr.zzbC().zzb(mContext, zzpT.afmaVersion, "gmob-apps", paramConnectionResult, true);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzin.zzaI("Disconnected from remote ad request service.");
  }
  
  public void zzgr()
  {
    synchronized (zzpV)
    {
      if ((zzHp.isConnected()) || (zzHp.isConnecting())) {
        zzHp.disconnect();
      }
      Binder.flushPendingCommands();
      if (zzHq)
      {
        zzr.zzbO().zzhD();
        zzHq = false;
      }
      return;
    }
  }
  
  /* Error */
  public zzj zzgs()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/ads/internal/request/zzd$zzb:zzpV	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 87	com/google/android/gms/ads/internal/request/zzd$zzb:zzHp	Lcom/google/android/gms/ads/internal/request/zze;
    //   11: invokevirtual 183	com/google/android/gms/ads/internal/request/zze:zzgw	()Lcom/google/android/gms/ads/internal/request/zzj;
    //   14: astore_2
    //   15: aload_1
    //   16: monitorexit
    //   17: aload_2
    //   18: areturn
    //   19: astore_2
    //   20: aload_1
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: astore_2
    //   25: aload_1
    //   26: monitorexit
    //   27: aload_2
    //   28: athrow
    //   29: astore_2
    //   30: goto -10 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	zzb
    //   14	4	2	localzzj	zzj
    //   19	1	2	localIllegalStateException	IllegalStateException
    //   24	4	2	localObject2	Object
    //   29	1	2	localDeadObjectException	android.os.DeadObjectException
    // Exception table:
    //   from	to	target	type
    //   7	15	19	java/lang/IllegalStateException
    //   7	15	24	finally
    //   15	17	24	finally
    //   7	15	29	android/os/DeadObjectException
  }
  
  zzit zzgt()
  {
    return new zzd.zza(mContext, zzHl, zzHm);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzd.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */