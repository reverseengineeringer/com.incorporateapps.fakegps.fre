package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.location.LocationStatusCodes;

final class zzl$zzb
  extends zzh.zza
{
  private zza.zzb zzaON;
  
  public zzl$zzb(zza.zzb paramzzb)
  {
    zzaON = paramzzb;
  }
  
  private void zzhC(int paramInt)
  {
    if (zzaON == null)
    {
      Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
      return;
    }
    Status localStatus = LocationStatusCodes.zzhz(LocationStatusCodes.zzhy(paramInt));
    zzaON.zzs(localStatus);
    zzaON = null;
  }
  
  public final void zza(int paramInt, PendingIntent paramPendingIntent)
  {
    zzhC(paramInt);
  }
  
  public final void zza(int paramInt, String[] paramArrayOfString)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
  }
  
  public final void zzb(int paramInt, String[] paramArrayOfString)
  {
    zzhC(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzl.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */