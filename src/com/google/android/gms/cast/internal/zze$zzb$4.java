package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import java.util.Map;

class zze$zzb$4
  implements Runnable
{
  zze$zzb$4(zze.zzb paramzzb, zze paramzze, String paramString1, String paramString2) {}
  
  public void run()
  {
    synchronized (zze.zze(zzadV))
    {
      Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)zze.zze(zzadV).get(zzZG);
      if (localMessageReceivedCallback != null)
      {
        localMessageReceivedCallback.onMessageReceived(zze.zzf(zzadV), zzZG, zzaea);
        return;
      }
    }
    zze.zzop().zzb("Discarded message for unknown namespace '%s'", new Object[] { zzZG });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zze.zzb.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */