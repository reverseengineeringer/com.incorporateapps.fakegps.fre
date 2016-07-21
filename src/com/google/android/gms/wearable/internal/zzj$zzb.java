package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityInfo;

class zzj$zzb
  implements CapabilityApi.CapabilityListener
{
  final CapabilityApi.CapabilityListener zzbrQ;
  final String zzbrR;
  
  zzj$zzb(CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    zzbrQ = paramCapabilityListener;
    zzbrR = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (paramObject == null);
        bool1 = bool2;
      } while (getClass() != paramObject.getClass());
      paramObject = (zzb)paramObject;
      bool1 = bool2;
    } while (!zzbrQ.equals(zzbrQ));
    return zzbrR.equals(zzbrR);
  }
  
  public int hashCode()
  {
    return zzbrQ.hashCode() * 31 + zzbrR.hashCode();
  }
  
  public void onCapabilityChanged(CapabilityInfo paramCapabilityInfo)
  {
    zzbrQ.onCapabilityChanged(paramCapabilityInfo);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */