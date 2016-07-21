package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.List;

public class zzbb$zza
  implements NodeApi.GetConnectedNodesResult
{
  private final Status zzUX;
  private final List zzbsW;
  
  public zzbb$zza(Status paramStatus, List paramList)
  {
    zzUX = paramStatus;
    zzbsW = paramList;
  }
  
  public List getNodes()
  {
    return zzbsW;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */