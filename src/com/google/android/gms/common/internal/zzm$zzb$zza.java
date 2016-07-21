package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public class zzm$zzb$zza
  implements ServiceConnection
{
  public zzm$zzb$zza(zzm.zzb paramzzb) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (zzm.zza(zzami.zzamh))
    {
      zzm.zzb.zza(zzami, paramIBinder);
      zzm.zzb.zza(zzami, paramComponentName);
      Iterator localIterator = zzm.zzb.zzb(zzami).iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    zzm.zzb.zza(zzami, 1);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (zzm.zza(zzami.zzamh))
    {
      zzm.zzb.zza(zzami, null);
      zzm.zzb.zza(zzami, paramComponentName);
      Iterator localIterator = zzm.zzb.zzb(zzami).iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    zzm.zzb.zza(zzami, 2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzm.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */