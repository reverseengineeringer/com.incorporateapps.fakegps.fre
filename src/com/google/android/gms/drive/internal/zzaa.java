package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

public class zzaa
  implements DrivePreferencesApi
{
  public PendingResult getFileUploadPreferences(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzaa.1(this, paramGoogleApiClient));
  }
  
  public PendingResult setFileUploadPreferences(GoogleApiClient paramGoogleApiClient, FileUploadPreferences paramFileUploadPreferences)
  {
    if (!(paramFileUploadPreferences instanceof FileUploadPreferencesImpl)) {
      throw new IllegalArgumentException("Invalid preference value");
    }
    return paramGoogleApiClient.zzb(new zzaa.2(this, paramGoogleApiClient, (FileUploadPreferencesImpl)paramFileUploadPreferences));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */