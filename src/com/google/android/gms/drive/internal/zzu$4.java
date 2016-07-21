package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzu$4
  extends zzt.zza
{
  zzu$4(zzu paramzzu, GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new RemoveEventListenerRequest(zzaqX, zzaqY), null, null, new zzbu(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzu.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */