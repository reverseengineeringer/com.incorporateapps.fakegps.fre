package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.location.LocationStatusCodes;

final class zzl$zza
  extends zzh.zza
{
  private zza.zzb zzaON;
  
  public zzl$zza(zza.zzb paramzzb)
  {
    zzaON = paramzzb;
  }
  
  public final void zza(int paramInt, PendingIntent paramPendingIntent)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
  }
  
  public final void zza(int paramInt, String[] paramArrayOfString)
  {
    if (zzaON == null)
    {
      Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
      return;
    }
    paramArrayOfString = LocationStatusCodes.zzhz(LocationStatusCodes.zzhy(paramInt));
    zzaON.zzs(paramArrayOfString);
    zzaON = null;
  }
  
  public final void zzb(int paramInt, String[] paramArrayOfString)
  {
    Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */