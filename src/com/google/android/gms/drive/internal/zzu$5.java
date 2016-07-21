package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

class zzu$5
  extends zzt.zza
{
  zzu$5(zzu paramzzu, GoogleApiClient paramGoogleApiClient, List paramList)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new CancelPendingActionsRequest(zzaqZ), new zzbu(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzu.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */