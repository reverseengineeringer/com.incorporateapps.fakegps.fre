package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;

public class zzn
  extends zzj
{
  public zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz)
  {
    if (!zzx(paramContext)) {
      return null;
    }
    return new zzc(paramContext, new zzt(paramContext, paramzzjp.zzhX(), paramzzjp.getRequestId(), paramzzcb, paramzzbz));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */