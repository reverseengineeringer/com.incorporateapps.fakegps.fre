package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

final class zzqk$zzf
  implements Connections.StartAdvertisingResult
{
  private final Status zzUX;
  private final String zzbbm;
  
  zzqk$zzf(Status paramStatus, String paramString)
  {
    zzUX = paramStatus;
    zzbbm = paramString;
  }
  
  public final String getLocalEndpointName()
  {
    return zzbbm;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */