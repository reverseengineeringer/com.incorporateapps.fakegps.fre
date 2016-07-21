package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzne;

public abstract class zzj
{
  public abstract zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz);
  
  protected boolean zzx(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    return (zzne.zzsg()) && ((paramContext == null) || (targetSdkVersion >= 11));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */