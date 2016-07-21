package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzqu.zza;

public class zzd
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private final zzqu.zza zzbdJ;
  private boolean zzbdK;
  private zzf zzbdy;
  
  public zzd(zzqu.zza paramzza)
  {
    zzbdJ = paramzza;
    zzbdy = null;
    zzbdK = true;
  }
  
  public void onConnected(Bundle paramBundle)
  {
    zzbdy.zzau(false);
    if ((zzbdK) && (zzbdJ != null)) {
      zzbdJ.zzES();
    }
    zzbdK = false;
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzbdy.zzau(true);
    if ((zzbdK) && (zzbdJ != null))
    {
      if (!paramConnectionResult.hasResolution()) {
        break label48;
      }
      zzbdJ.zzc(paramConnectionResult.getResolution());
    }
    for (;;)
    {
      zzbdK = false;
      return;
      label48:
      zzbdJ.zzET();
    }
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzbdy.zzau(true);
  }
  
  public void zza(zzf paramzzf)
  {
    zzbdy = paramzzf;
  }
  
  public void zzat(boolean paramBoolean)
  {
    zzbdK = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.playlog.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */