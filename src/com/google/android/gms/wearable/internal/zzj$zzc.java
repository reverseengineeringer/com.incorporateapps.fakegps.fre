package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Set;

public class zzj$zzc
  implements CapabilityInfo
{
  private final String mName;
  private final Set zzbrS;
  
  public zzj$zzc(CapabilityInfo paramCapabilityInfo)
  {
    this(paramCapabilityInfo.getName(), paramCapabilityInfo.getNodes());
  }
  
  public zzj$zzc(String paramString, Set paramSet)
  {
    mName = paramString;
    zzbrS = paramSet;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public Set getNodes()
  {
    return zzbrS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */