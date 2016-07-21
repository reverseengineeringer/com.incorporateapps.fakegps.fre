package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Queue;

public class zzi
  implements zzk
{
  private final zzl zzahj;
  
  public zzi(zzl paramzzl)
  {
    zzahj = paramzzl;
  }
  
  public void begin()
  {
    zzahj.zzpM();
    zzahj.zzagW.zzahU = Collections.emptySet();
  }
  
  public void connect()
  {
    zzahj.zzpK();
  }
  
  public boolean disconnect()
  {
    return true;
  }
  
  public void onConnected(Bundle paramBundle) {}
  
  public void onConnectionSuspended(int paramInt) {}
  
  public zza.zza zza(zza.zza paramzza)
  {
    zzahj.zzagW.zzahN.add(paramzza);
    return paramzza;
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt) {}
  
  public zza.zza zzb(zza.zza paramzza)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */