package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

public final class CastRemoteDisplay$CastRemoteDisplayOptions$Builder
{
  CastDevice zzZO;
  CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaae;
  
  public CastRemoteDisplay$CastRemoteDisplayOptions$Builder(CastDevice paramCastDevice, CastRemoteDisplay.CastRemoteDisplaySessionCallbacks paramCastRemoteDisplaySessionCallbacks)
  {
    zzx.zzb(paramCastDevice, "CastDevice parameter cannot be null");
    zzZO = paramCastDevice;
    zzaae = paramCastRemoteDisplaySessionCallbacks;
  }
  
  public final CastRemoteDisplay.CastRemoteDisplayOptions build()
  {
    return new CastRemoteDisplay.CastRemoteDisplayOptions(this, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplayOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */