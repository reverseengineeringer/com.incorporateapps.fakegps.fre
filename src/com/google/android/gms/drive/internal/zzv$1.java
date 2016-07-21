package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;

class zzv$1
  extends zzs.zzc
{
  zzv$1(zzv paramzzv, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new OpenContentsRequest(zzard.getDriveId(), 536870912, zzv.zza(zzard).getRequestId()), new zzbl(this, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzv.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */