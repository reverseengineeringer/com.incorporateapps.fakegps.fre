package com.google.android.gms.internal;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class zzli$4
  implements ResultCallback
{
  zzli$4(zzli paramzzli, long paramLong) {}
  
  public void zzp(Status paramStatus)
  {
    if (!paramStatus.isSuccess()) {
      zzacN.zzb(zzacS, paramStatus.getStatusCode());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */