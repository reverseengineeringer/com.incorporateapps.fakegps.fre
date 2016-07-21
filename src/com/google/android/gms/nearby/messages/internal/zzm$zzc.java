package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzm$zzc
  extends zzd.zza
  implements zzm.zza
{
  private final zzq zzbbi;
  
  private zzm$zzc(zzq paramzzq)
  {
    zzbbi = paramzzq;
  }
  
  public zzq zzEE()
  {
    return zzbbi;
  }
  
  public void zza(MessageWrapper paramMessageWrapper)
  {
    zzbbi.zza(new zzm.zzc.1(this, paramMessageWrapper));
  }
  
  public void zza(MessageWrapper[] paramArrayOfMessageWrapper)
  {
    zzbbi.zza(new zzm.zzc.2(this, paramArrayOfMessageWrapper));
  }
  
  public void zzb(MessageWrapper paramMessageWrapper)
  {
    zzbbi.zza(new zzm.zzc.3(this, paramMessageWrapper));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */