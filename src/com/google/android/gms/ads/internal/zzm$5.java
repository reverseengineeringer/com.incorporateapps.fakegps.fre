package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

final class zzm$5
  implements zzdf
{
  zzm$5(zzfb paramzzfb, zzf.zza paramzza, zzfc paramzzfc) {}
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    paramMap = paramzzjp.getView();
    if (paramMap == null) {}
    do
    {
      return;
      try
      {
        if (zzqv == null) {
          continue;
        }
        if (!zzqv.getOverrideClickHandling())
        {
          zzqv.zzc(zze.zzC(paramMap));
          zzqw.onClick();
          return;
        }
      }
      catch (RemoteException paramzzjp)
      {
        zzin.zzd("Unable to call handleClick on mapper", paramzzjp);
        return;
      }
      zzm.zzb(paramzzjp);
      return;
    } while (zzqx == null);
    if (!zzqx.getOverrideClickHandling())
    {
      zzqx.zzc(zze.zzC(paramMap));
      zzqw.onClick();
      return;
    }
    zzm.zzb(paramzzjp);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzm.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */