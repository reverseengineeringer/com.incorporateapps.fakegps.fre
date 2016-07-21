package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzqk$zzb
  extends zzqj
{
  private final zzq zzbbb;
  
  zzqk$zzb(zzq paramzzq)
  {
    zzbbb = paramzzq;
  }
  
  public void onDisconnected(String paramString)
  {
    zzbbb.zza(new zzqk.zzb.2(this, paramString));
  }
  
  public void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    zzbbb.zza(new zzqk.zzb.1(this, paramString, paramArrayOfByte, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */