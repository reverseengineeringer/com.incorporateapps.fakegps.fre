package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

final class zzbo$zzq
  extends zzbo.zzb
{
  private final List zzzM;
  
  zzbo$zzq(zza.zzb paramzzb, List paramList)
  {
    super(paramzzb);
    zzzM = paramList;
  }
  
  public final void zza(PutDataResponse paramPutDataResponse)
  {
    zzX(new zzx.zza(zzbk.zzgc(statusCode), zzbsJ));
    if (statusCode != 0)
    {
      paramPutDataResponse = zzzM.iterator();
      while (paramPutDataResponse.hasNext()) {
        ((FutureTask)paramPutDataResponse.next()).cancel(true);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */