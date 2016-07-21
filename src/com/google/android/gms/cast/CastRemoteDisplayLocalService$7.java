package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

class CastRemoteDisplayLocalService$7
  implements CastRemoteDisplay.CastRemoteDisplaySessionCallbacks
{
  CastRemoteDisplayLocalService$7(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onRemoteDisplayEnded(Status paramStatus)
  {
    CastRemoteDisplayLocalService.zznI().zzb(String.format("Cast screen has ended: %d", new Object[] { Integer.valueOf(paramStatus.getStatusCode()) }), new Object[0]);
    CastRemoteDisplayLocalService.zzU(false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */