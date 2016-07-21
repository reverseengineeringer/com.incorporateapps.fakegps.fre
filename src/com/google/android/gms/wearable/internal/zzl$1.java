package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;

class zzl$1
  extends zzi
{
  zzl$1(zzl paramzzl, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zze(this, zzbrW, zzAP);
  }
  
  public ChannelApi.OpenChannelResult zzbs(Status paramStatus)
  {
    return new zzl.zza(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */