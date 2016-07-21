package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;

class zzaa$2
  extends zzt.zza
{
  zzaa$2(zzaa paramzzaa, GoogleApiClient paramGoogleApiClient, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    paramzzu.zzte().zza(new SetFileUploadPreferencesRequest(zzarv), new zzbu(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzaa.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */