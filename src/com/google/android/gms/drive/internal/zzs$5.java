package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzs$5
  extends zzt
{
  zzs$5(zzs paramzzs, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BooleanResult zzA(Status paramStatus)
  {
    return new BooleanResult(paramStatus, false);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zze(new zzs.5.1(this, this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */