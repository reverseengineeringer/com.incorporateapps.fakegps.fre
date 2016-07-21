package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.nearby.messages.MessageListener;

class zzm$zzc$2
  implements zzq.zzb
{
  zzm$zzc$2(zzm.zzc paramzzc, MessageWrapper[] paramArrayOfMessageWrapper) {}
  
  public void zza(MessageListener paramMessageListener)
  {
    MessageWrapper[] arrayOfMessageWrapper = zzbcE;
    int j = arrayOfMessageWrapper.length;
    int i = 0;
    while (i < j)
    {
      paramMessageListener.zza(zzbcu);
      i += 1;
    }
  }
  
  public void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzc.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */