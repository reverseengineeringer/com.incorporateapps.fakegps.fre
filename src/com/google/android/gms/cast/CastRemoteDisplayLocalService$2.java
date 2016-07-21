package com.google.android.gms.cast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

class CastRemoteDisplayLocalService$2
  implements GoogleApiClient.OnConnectionFailedListener
{
  CastRemoteDisplayLocalService$2(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    CastRemoteDisplayLocalService.zzb(zzaaz, "Connection failed: " + paramConnectionResult);
    CastRemoteDisplayLocalService.zzc(zzaaz);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */