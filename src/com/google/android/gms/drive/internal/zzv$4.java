package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;

class zzv$4
  extends zzt.zza
{
  zzv$4(zzv paramzzv, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new CloseContentsRequest(zzv.zza(zzard).getRequestId(), false), new zzbu(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzv.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */