package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import java.util.Map;

public class zzj$zzd
  implements CapabilityApi.GetAllCapabilitiesResult
{
  private final Status zzUX;
  private final Map zzbrT;
  
  public zzj$zzd(Status paramStatus, Map paramMap)
  {
    zzUX = paramStatus;
    zzbrT = paramMap;
  }
  
  public Map getAllCapabilities()
  {
    return zzbrT;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */