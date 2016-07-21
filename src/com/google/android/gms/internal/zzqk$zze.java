package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zze
  extends zzqj
{
  private final zza.zzb zzamC;
  private final zzq zzbbi;
  
  zzqk$zze(zza.zzb paramzzb, zzq paramzzq)
  {
    zzamC = ((zza.zzb)zzx.zzz(paramzzb));
    zzbbi = ((zzq)zzx.zzz(paramzzq));
  }
  
  public final void onConnectionRequest(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    zzbbi.zza(new zzqk.zze.1(this, paramString1, paramString2, paramString3, paramArrayOfByte));
  }
  
  public final void zzm(int paramInt, String paramString)
  {
    zzamC.zzs(new zzqk.zzf(new Status(paramInt), paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */