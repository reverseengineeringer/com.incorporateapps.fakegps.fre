package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityInfo;

public class zzj$zze
  implements CapabilityApi.GetCapabilityResult
{
  private final Status zzUX;
  private final CapabilityInfo zzbrU;
  
  public zzj$zze(Status paramStatus, CapabilityInfo paramCapabilityInfo)
  {
    zzUX = paramStatus;
    zzbrU = paramCapabilityInfo;
  }
  
  public CapabilityInfo getCapability()
  {
    return zzbrU;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */