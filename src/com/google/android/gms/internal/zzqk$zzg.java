package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zzg
  extends zzqj
{
  private final zza.zzb zzamC;
  private final zzq zzbbi;
  
  zzqk$zzg(zza.zzb paramzzb, zzq paramzzq)
  {
    zzamC = ((zza.zzb)zzx.zzz(paramzzb));
    zzbbi = ((zzq)zzx.zzz(paramzzq));
  }
  
  public final void onEndpointFound(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zzbbi.zza(new zzqk.zzg.1(this, paramString1, paramString2, paramString3, paramString4));
  }
  
  public final void onEndpointLost(String paramString)
  {
    zzbbi.zza(new zzqk.zzg.2(this, paramString));
  }
  
  public final void zziW(int paramInt)
  {
    zzamC.zzs(new Status(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */