package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

public abstract interface CastRemoteDisplayLocalService$Callbacks
{
  public abstract void onRemoteDisplaySessionError(Status paramStatus);
  
  public abstract void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService);
  
  public abstract void onServiceCreated(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService);
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.Callbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */