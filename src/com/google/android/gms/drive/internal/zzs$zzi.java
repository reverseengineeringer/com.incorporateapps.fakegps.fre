package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.MetadataBuffer;

class zzs$zzi
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zzi(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzs.zzg(paramStatus, null, false));
  }
  
  public void zza(OnListEntriesResponse paramOnListEntriesResponse)
  {
    MetadataBuffer localMetadataBuffer = new MetadataBuffer(paramOnListEntriesResponse.zztt());
    zzamC.zzs(new zzs.zzg(Status.zzagC, localMetadataBuffer, paramOnListEntriesResponse.zztu()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */