package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.PublishCallback;

class zzm$zzd
  extends zzg.zza
{
  private final PublishCallback zzbcG;
  
  private zzm$zzd(PublishCallback paramPublishCallback)
  {
    zzbcG = paramPublishCallback;
  }
  
  private static zzd zza(PublishCallback paramPublishCallback)
  {
    if (paramPublishCallback == null) {
      return null;
    }
    return new zzd(paramPublishCallback);
  }
  
  public void onExpired()
  {
    zzbcG.onExpired();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */