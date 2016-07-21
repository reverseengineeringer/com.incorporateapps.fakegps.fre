package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzr;

public class zzdp
  extends zzim
{
  final zzjp zzpD;
  final zzdr zzzJ;
  private final String zzzK;
  
  zzdp(zzjp paramzzjp, zzdr paramzzdr, String paramString)
  {
    zzpD = paramzzjp;
    zzzJ = paramzzdr;
    zzzK = paramString;
    zzr.zzbR().zza(this);
  }
  
  public void onStop()
  {
    zzzJ.abort();
  }
  
  public void zzbr()
  {
    try
    {
      zzzJ.zzU(zzzK);
      return;
    }
    finally
    {
      zzir.zzMc.post(new zzdp.1(this));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */