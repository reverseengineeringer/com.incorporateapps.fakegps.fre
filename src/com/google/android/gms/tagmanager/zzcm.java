package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzcm
  implements zzp.zze
{
  private boolean mClosed;
  private final Context mContext;
  private final String zzbhM;
  private String zzbij;
  private zzbf zzbkg;
  private zzs zzbkh;
  private final ScheduledExecutorService zzbkj;
  private final zzcm.zza zzbkk;
  private ScheduledFuture zzbkl;
  
  public zzcm(Context paramContext, String paramString, zzs paramzzs)
  {
    this(paramContext, paramString, paramzzs, null, null);
  }
  
  zzcm(Context paramContext, String paramString, zzs paramzzs, zzcm.zzb paramzzb, zzcm.zza paramzza)
  {
    zzbkh = paramzzs;
    mContext = paramContext;
    zzbhM = paramString;
    paramContext = paramzzb;
    if (paramzzb == null) {
      paramContext = new zzcm.1(this);
    }
    zzbkj = paramContext.zzHb();
    if (paramzza == null)
    {
      zzbkk = new zzcm.2(this);
      return;
    }
    zzbkk = paramzza;
  }
  
  private void zzHa()
  {
    try
    {
      if (mClosed) {
        throw new IllegalStateException("called method after closed");
      }
    }
    finally {}
  }
  
  private zzcl zzgm(String paramString)
  {
    zzcl localzzcl = zzbkk.zza(zzbkh);
    localzzcl.zza(zzbkg);
    localzzcl.zzfW(zzbij);
    localzzcl.zzgl(paramString);
    return localzzcl;
  }
  
  public void release()
  {
    try
    {
      zzHa();
      if (zzbkl != null) {
        zzbkl.cancel(false);
      }
      zzbkj.shutdown();
      mClosed = true;
      return;
    }
    finally {}
  }
  
  public void zza(zzbf paramzzbf)
  {
    try
    {
      zzHa();
      zzbkg = paramzzbf;
      return;
    }
    finally
    {
      paramzzbf = finally;
      throw paramzzbf;
    }
  }
  
  public void zzf(long paramLong, String paramString)
  {
    try
    {
      zzbg.v("loadAfterDelay: containerId=" + zzbhM + " delay=" + paramLong);
      zzHa();
      if (zzbkg == null) {
        throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
      }
    }
    finally {}
    if (zzbkl != null) {
      zzbkl.cancel(false);
    }
    zzbkl = zzbkj.schedule(zzgm(paramString), paramLong, TimeUnit.MILLISECONDS);
  }
  
  public void zzfW(String paramString)
  {
    try
    {
      zzHa();
      zzbij = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */