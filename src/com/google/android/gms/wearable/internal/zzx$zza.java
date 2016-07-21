package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataItem;

public class zzx$zza
  implements DataApi.DataItemResult
{
  private final Status zzUX;
  private final DataItem zzbsv;
  
  public zzx$zza(Status paramStatus, DataItem paramDataItem)
  {
    zzUX = paramStatus;
    zzbsv = paramDataItem;
  }
  
  public DataItem getDataItem()
  {
    return zzbsv;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */