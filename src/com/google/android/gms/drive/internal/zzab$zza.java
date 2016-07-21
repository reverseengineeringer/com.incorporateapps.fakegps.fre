package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.MetadataBuffer;

class zzab$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzab$zza(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzs.zzg(paramStatus, null, false));
  }
  
  public void zza(OnListParentsResponse paramOnListParentsResponse)
  {
    paramOnListParentsResponse = new MetadataBuffer(paramOnListParentsResponse.zztv());
    zzamC.zzs(new zzs.zzg(Status.zzagC, paramOnListParentsResponse, false));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */