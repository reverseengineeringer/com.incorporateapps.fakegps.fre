package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;

public class zzbs
{
  private final Object zzpV = new Object();
  private boolean zzqA = false;
  private SharedPreferences zzvx = null;
  
  public void initialize(Context paramContext)
  {
    synchronized (zzpV)
    {
      if (zzqA) {
        return;
      }
      paramContext = zze.getRemoteContext(paramContext);
      if (paramContext == null) {
        return;
      }
    }
    zzvx = zzr.zzbJ().zzw(paramContext);
    zzqA = true;
  }
  
  public Object zzd(zzbp paramzzbp)
  {
    synchronized (zzpV)
    {
      if (!zzqA)
      {
        paramzzbp = paramzzbp.zzdq();
        return paramzzbp;
      }
      return zzjb.zzb(new zzbs.1(this, paramzzbp));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */