package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;

public abstract interface zzk
{
  public abstract void begin();
  
  public abstract void connect();
  
  public abstract boolean disconnect();
  
  public abstract void onConnected(Bundle paramBundle);
  
  public abstract void onConnectionSuspended(int paramInt);
  
  public abstract zza.zza zza(zza.zza paramzza);
  
  public abstract void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt);
  
  public abstract zza.zza zzb(zza.zza paramzza);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */