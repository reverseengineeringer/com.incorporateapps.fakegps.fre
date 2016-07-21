package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;

class zzay$zzb
  extends zzbo.zzb
{
  private WeakReference zzbsM;
  private WeakReference zzbsN;
  
  zzay$zzb(Map paramMap, Object paramObject, zza.zzb paramzzb)
  {
    super(paramzzb);
    zzbsM = new WeakReference(paramMap);
    zzbsN = new WeakReference(paramObject);
  }
  
  public void zza(Status paramStatus)
  {
    Map localMap = (Map)zzbsM.get();
    Object localObject = zzbsN.get();
    if ((paramStatus.getStatus().getStatusCode() == 4002) && (localMap != null) && (localObject != null)) {}
    try
    {
      localObject = (zzbq)localMap.remove(localObject);
      if (localObject != null) {
        ((zzbq)localObject).clear();
      }
      zzX(paramStatus);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzay.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */