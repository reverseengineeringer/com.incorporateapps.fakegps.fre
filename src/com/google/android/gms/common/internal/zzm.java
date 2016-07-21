package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;

final class zzm
  extends zzl
  implements Handler.Callback
{
  private final Handler mHandler;
  private final HashMap zzalZ = new HashMap();
  private final zzb zzama;
  private final long zzamb;
  private final Context zzsa;
  
  zzm(Context paramContext)
  {
    zzsa = paramContext.getApplicationContext();
    mHandler = new Handler(paramContext.getMainLooper(), this);
    zzama = zzb.zzrP();
    zzamb = 5000L;
  }
  
  private boolean zza(zzm.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    zzx.zzb(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      zzm.zzb localzzb;
      synchronized (zzalZ)
      {
        localzzb = (zzm.zzb)zzalZ.get(paramzza);
        if (localzzb == null)
        {
          localzzb = new zzm.zzb(this, paramzza);
          localzzb.zza(paramServiceConnection, paramString);
          localzzb.zzcH(paramString);
          zzalZ.put(paramzza, localzzb);
          paramzza = localzzb;
          boolean bool = paramzza.isBound();
          return bool;
        }
        mHandler.removeMessages(0, localzzb);
        if (localzzb.zza(paramServiceConnection)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + paramzza);
        }
      }
      localzzb.zza(paramServiceConnection, paramString);
      switch (localzzb.getState())
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localzzb.getComponentName(), localzzb.getBinder());
        paramzza = localzzb;
        break;
      case 2: 
        localzzb.zzcH(paramString);
        paramzza = localzzb;
        break;
      default: 
        paramzza = localzzb;
      }
    }
  }
  
  private void zzb(zzm.zza paramzza, ServiceConnection paramServiceConnection, String paramString)
  {
    zzx.zzb(paramServiceConnection, "ServiceConnection must not be null");
    zzm.zzb localzzb;
    synchronized (zzalZ)
    {
      localzzb = (zzm.zzb)zzalZ.get(paramzza);
      if (localzzb == null) {
        throw new IllegalStateException("Nonexistent connection status for service config: " + paramzza);
      }
    }
    if (!localzzb.zza(paramServiceConnection)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + paramzza);
    }
    localzzb.zzb(paramServiceConnection, paramString);
    if (localzzb.zzqT())
    {
      paramzza = mHandler.obtainMessage(0, localzzb);
      mHandler.sendMessageDelayed(paramzza, zzamb);
    }
  }
  
  public final boolean handleMessage(Message arg1)
  {
    switch (what)
    {
    default: 
      return false;
    }
    zzm.zzb localzzb = (zzm.zzb)obj;
    synchronized (zzalZ)
    {
      if (localzzb.zzqT())
      {
        if (localzzb.isBound()) {
          localzzb.zzcI("GmsClientSupervisor");
        }
        zzalZ.remove(zzm.zzb.zza(localzzb));
      }
      return true;
    }
  }
  
  public final boolean zza(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return zza(new zzm.zza(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final boolean zza(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    return zza(new zzm.zza(paramString1), paramServiceConnection, paramString2);
  }
  
  public final void zzb(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    zzb(new zzm.zza(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final void zzb(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    zzb(new zzm.zza(paramString1), paramServiceConnection, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */