package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.SubscribeCallback;

class zzm$zzf
  extends zzi.zza
{
  private final SubscribeCallback zzbcK;
  
  private zzm$zzf(SubscribeCallback paramSubscribeCallback)
  {
    zzbcK = paramSubscribeCallback;
  }
  
  private static zzf zza(SubscribeCallback paramSubscribeCallback)
  {
    if (paramSubscribeCallback == null) {
      return null;
    }
    return new zzf(paramSubscribeCallback);
  }
  
  public void onExpired()
  {
    zzbcK.onExpired();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */