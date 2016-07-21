package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzay
{
  private final Map zzaxd = new HashMap();
  
  public final void zza(zzbp paramzzbp, zza.zzb paramzzb, Object paramObject)
  {
    synchronized (zzaxd)
    {
      zzbq localzzbq = (zzbq)zzaxd.remove(paramObject);
      if (localzzbq == null)
      {
        paramzzb.zzs(new Status(4002));
        return;
      }
      localzzbq.clear();
      ((zzax)paramzzbp.zzqJ()).zza(new zzay.zzb(zzaxd, paramObject, paramzzb), new RemoveListenerRequest(localzzbq));
      return;
    }
  }
  
  public final void zza(zzbp paramzzbp, zza.zzb paramzzb, Object paramObject, zzbq paramzzbq)
  {
    synchronized (zzaxd)
    {
      if (zzaxd.get(paramObject) != null)
      {
        paramzzb.zzs(new Status(4001));
        return;
      }
      zzaxd.put(paramObject, paramzzbq);
    }
  }
  
  public final void zzev(IBinder paramIBinder)
  {
    synchronized (zzaxd)
    {
      paramIBinder = zzax.zza.zzeu(paramIBinder);
      zzbo.zzo localzzo = new zzbo.zzo();
      Iterator localIterator = zzaxd.entrySet().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          zzbq localzzbq = (zzbq)localEntry.getValue();
          try
          {
            paramIBinder.zza(localzzo, new AddListenerRequest(localzzbq));
            if (Log.isLoggable("WearableClient", 2)) {
              Log.d("WearableClient", "onPostInitHandler: added: " + localEntry.getKey() + "/" + localzzbq);
            }
          }
          catch (RemoteException localRemoteException)
          {
            Log.d("WearableClient", "onPostInitHandler: Didn't add: " + localEntry.getKey() + "/" + localzzbq);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */