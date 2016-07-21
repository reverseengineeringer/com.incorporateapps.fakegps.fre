package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;

class zzaa$zzb
  implements DrivePreferencesApi.FileUploadPreferencesResult
{
  private final Status zzUX;
  private final FileUploadPreferences zzarw;
  
  private zzaa$zzb(zzaa paramzzaa, Status paramStatus, FileUploadPreferences paramFileUploadPreferences)
  {
    zzUX = paramStatus;
    zzarw = paramFileUploadPreferences;
  }
  
  public FileUploadPreferences getFileUploadPreferences()
  {
    return zzarw;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzaa.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */