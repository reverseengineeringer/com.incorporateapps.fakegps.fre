package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class zzgq
  extends zzim
{
  protected final Context mContext;
  protected final zzgr.zza zzGc;
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;
  protected final Object zzGg = new Object();
  protected final Object zzpV = new Object();
  
  protected zzgq(Context paramContext, zzif.zza paramzza, zzgr.zza paramzza1)
  {
    super(true);
    mContext = paramContext;
    zzGd = paramzza;
    zzGe = zzLe;
    zzGc = paramzza1;
  }
  
  public void onStop() {}
  
  protected abstract zzif zzD(int paramInt);
  
  public void zzbr()
  {
    for (;;)
    {
      int i;
      synchronized (zzpV)
      {
        zzin.zzaI("AdRendererBackgroundTask started.");
        i = zzGd.errorCode;
        try
        {
          zzh(SystemClock.elapsedRealtime());
          zzif localzzif = zzD(i);
          zzir.zzMc.post(new zzgq.2(this, localzzif));
          return;
        }
        catch (zzgq.zza localzza)
        {
          i = localzza.getErrorCode();
          if (i == 3) {
            continue;
          }
        }
        if (i == -1)
        {
          zzin.zzaJ(localzza.getMessage());
          if (zzGe == null)
          {
            zzGe = new AdResponseParcel(i);
            zzir.zzMc.post(new zzgq.1(this));
          }
        }
        else
        {
          zzin.zzaK(localzza.getMessage());
        }
      }
      zzGe = new AdResponseParcel(i, zzGe.zzBU);
    }
  }
  
  protected abstract void zzh(long paramLong);
  
  protected void zzm(zzif paramzzif)
  {
    zzGc.zzb(paramzzif);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */