package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

class zzaz$1
  extends zzi
{
  zzaz$1(zzaz paramzzaz, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbrW, zzbsO, zzbsP);
  }
  
  protected MessageApi.SendMessageResult zzbz(Status paramStatus)
  {
    return new zzaz.zzb(paramStatus, -1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaz.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */