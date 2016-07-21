package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

public class zzx$zzb
  implements DataApi.DeleteDataItemsResult
{
  private final Status zzUX;
  private final int zzbsw;
  
  public zzx$zzb(Status paramStatus, int paramInt)
  {
    zzUX = paramStatus;
    zzbsw = paramInt;
  }
  
  public int getNumDeleted()
  {
    return zzbsw;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */