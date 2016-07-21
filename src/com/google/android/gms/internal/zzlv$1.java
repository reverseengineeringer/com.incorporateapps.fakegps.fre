package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

class zzlv$1
  implements Runnable
{
  zzlv$1(zzlv paramzzlv) {}
  
  public void run()
  {
    synchronized (zzlv.zza(zzafw))
    {
      if ((zzlv.zzb(zzafw) <= zzlv.zzc(zzafw).elapsedRealtime()) && (zzlv.zzd(zzafw) != null))
      {
        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
        zzlv.zzd(zzafw).disconnect();
        zzlv.zza(zzafw, null);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlv.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */