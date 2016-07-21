package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zzd
  extends zzqk.zzb
{
  private final zza.zzb zzamC;
  private final zzq zzbbg;
  
  public zzqk$zzd(zza.zzb paramzzb, zzq paramzzq1, zzq paramzzq2)
  {
    super(paramzzq2);
    zzamC = ((zza.zzb)zzx.zzz(paramzzb));
    zzbbg = ((zzq)zzx.zzz(paramzzq1));
  }
  
  public final void zza(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    zzbbg.zza(new zzqk.zzd.1(this, paramString, paramInt, paramArrayOfByte));
  }
  
  public final void zziY(int paramInt)
  {
    zzamC.zzs(new Status(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */