package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzs$3
  extends zzs.zzf
{
  zzs$3(zzs paramzzs, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new GetMetadataRequest(DriveId.zzcW(zzaqF), false), new zzs.zzd(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */