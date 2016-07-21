package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

class CastRemoteDisplayLocalService$10
  implements GoogleApiClient.ConnectionCallbacks
{
  CastRemoteDisplayLocalService$10(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onConnected(Bundle paramBundle)
  {
    CastRemoteDisplayLocalService.zza(zzaaz, "onConnected");
    CastRemoteDisplayLocalService.zzf(zzaaz);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    CastRemoteDisplayLocalService.zznI().zzf(String.format("[Instance: %s] ConnectionSuspended %d", new Object[] { this, Integer.valueOf(paramInt) }), new Object[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */