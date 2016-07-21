package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

class zze$zzb
  extends zzj.zza
{
  private final Handler mHandler;
  private final AtomicReference zzadU;
  
  public zze$zzb(zze paramzze)
  {
    zzadU = new AtomicReference(paramzze);
    mHandler = new Handler(paramzze.getLooper());
  }
  
  private void zza(zze paramzze, long paramLong, int paramInt)
  {
    synchronized (zze.zzg(paramzze))
    {
      paramzze = (zza.zzb)zze.zzg(paramzze).remove(Long.valueOf(paramLong));
      if (paramzze != null) {
        paramzze.zzs(new Status(paramInt));
      }
      return;
    }
  }
  
  private boolean zza(zze paramzze, int paramInt)
  {
    synchronized ()
    {
      if (zze.zzh(paramzze) != null)
      {
        zze.zzh(paramzze).zzs(new Status(paramInt));
        zze.zzb(paramzze, null);
        return true;
      }
      return false;
    }
  }
  
  public boolean isDisposed()
  {
    return zzadU.get() == null;
  }
  
  public void onApplicationDisconnected(int paramInt)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {}
    do
    {
      return;
      zze.zza(localzze, null);
      zze.zzb(localzze, null);
      zza(localzze, paramInt);
    } while (zze.zzd(localzze) == null);
    mHandler.post(new zze.zzb.1(this, localzze, paramInt));
  }
  
  public void zza(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zze.zza(localzze, paramApplicationMetadata);
    zze.zza(localzze, paramApplicationMetadata.getApplicationId());
    zze.zzb(localzze, paramString2);
    synchronized (zze.zzoq())
    {
      if (zze.zzc(localzze) != null)
      {
        zze.zzc(localzze).zzs(new zze.zza(new Status(0), paramApplicationMetadata, paramString1, paramString2, paramBoolean));
        zze.zza(localzze, null);
      }
      return;
    }
  }
  
  public void zza(String paramString, double paramDouble, boolean paramBoolean)
  {
    zze.zzop().zzb("Deprecated callback: \"onStatusreceived\"", new Object[0]);
  }
  
  public void zza(String paramString, long paramLong, int paramInt)
  {
    paramString = (zze)zzadU.get();
    if (paramString == null) {
      return;
    }
    zza(paramString, paramLong, paramInt);
  }
  
  public void zzb(ApplicationStatus paramApplicationStatus)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zze.zzop().zzb("onApplicationStatusChanged", new Object[0]);
    mHandler.post(new zze.zzb.3(this, localzze, paramApplicationStatus));
  }
  
  public void zzb(DeviceStatus paramDeviceStatus)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zze.zzop().zzb("onDeviceStatusChanged", new Object[0]);
    mHandler.post(new zze.zzb.2(this, localzze, paramDeviceStatus));
  }
  
  public void zzb(String paramString, byte[] paramArrayOfByte)
  {
    if ((zze)zzadU.get() == null) {
      return;
    }
    zze.zzop().zzb("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] { paramString, Integer.valueOf(paramArrayOfByte.length) });
  }
  
  public void zzbk(int paramInt)
  {
    zze localzze = zzos();
    if (localzze == null) {}
    do
    {
      return;
      zze.zzop().zzb("ICastDeviceControllerListener.onDisconnected: %d", new Object[] { Integer.valueOf(paramInt) });
    } while (paramInt == 0);
    localzze.zzbS(2);
  }
  
  public void zzbl(int paramInt)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    synchronized (zze.zzoq())
    {
      if (zze.zzc(localzze) != null)
      {
        zze.zzc(localzze).zzs(new zze.zza(new Status(paramInt)));
        zze.zza(localzze, null);
      }
      return;
    }
  }
  
  public void zzbm(int paramInt)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zza(localzze, paramInt);
  }
  
  public void zzbn(int paramInt)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zza(localzze, paramInt);
  }
  
  public void zzc(String paramString, long paramLong)
  {
    paramString = (zze)zzadU.get();
    if (paramString == null) {
      return;
    }
    zza(paramString, paramLong, 0);
  }
  
  public zze zzos()
  {
    zze localzze = (zze)zzadU.getAndSet(null);
    if (localzze == null) {
      return null;
    }
    zze.zzb(localzze);
    return localzze;
  }
  
  public void zzt(String paramString1, String paramString2)
  {
    zze localzze = (zze)zzadU.get();
    if (localzze == null) {
      return;
    }
    zze.zzop().zzb("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
    mHandler.post(new zze.zzb.4(this, localzze, paramString1, paramString2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zze.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */