package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Status;

class zzli$zza$1
  implements zzo
{
  zzli$zza$1(zzli.zza paramzza, zzli paramzzli) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    if (paramObject == null) {}
    try
    {
      zzacU.zza(new zzli.zze(new Status(paramInt, null, null), null, paramLong, null));
      return;
    }
    catch (ClassCastException paramObject)
    {
      String str;
      zzacU.zza(zzacU.zzr(new Status(13)));
    }
    paramObject = (zzlk)paramObject;
    str = ((zzlk)paramObject).getPlayerId();
    if ((paramInt == 0) && (str != null)) {
      zzli.zza(zzacU.zzacN, str);
    }
    zzacU.zza(new zzli.zze(new Status(paramInt, ((zzlk)paramObject).zznZ(), null), str, ((zzlk)paramObject).getRequestId(), ((zzlk)paramObject).getExtraMessageData()));
    return;
  }
  
  public void zzy(long paramLong)
  {
    zzacU.zza(zzacU.zzr(new Status(2103)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zza.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */