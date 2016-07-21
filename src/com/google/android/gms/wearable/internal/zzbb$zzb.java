package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

public class zzbb$zzb
  implements NodeApi.GetLocalNodeResult
{
  private final Status zzUX;
  private final Node zzbsX;
  
  public zzbb$zzb(Status paramStatus, Node paramNode)
  {
    zzUX = paramStatus;
    zzbsX = paramNode;
  }
  
  public Node getNode()
  {
    return zzbsX;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbb.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */