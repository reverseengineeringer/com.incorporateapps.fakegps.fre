package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.zza;
import java.util.Set;

class zzj$1
  implements zzj.zzd
{
  zzj$1(zzj paramzzj) {}
  
  public void zzc(zzj.zze paramzze)
  {
    zzaid.zzahW.remove(paramzze);
    if ((paramzze.zzpa() != null) && (zzj.zza(zzaid) != null)) {
      zzj.zza(zzaid).remove(paramzze.zzpa().intValue());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */