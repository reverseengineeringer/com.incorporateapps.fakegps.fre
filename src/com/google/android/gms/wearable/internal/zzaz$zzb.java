package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public class zzaz$zzb
  implements MessageApi.SendMessageResult
{
  private final Status zzUX;
  private final int zzaox;
  
  public zzaz$zzb(Status paramStatus, int paramInt)
  {
    zzUX = paramStatus;
    zzaox = paramInt;
  }
  
  public int getRequestId()
  {
    return zzaox;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaz.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */