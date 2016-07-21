package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzb;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;
import com.google.android.gms.internal.zzrq.zza;
import com.google.android.gms.internal.zzrr;
import com.google.android.gms.internal.zzrs.zzc;

public class zzp
  extends zzb
{
  private final Context mContext;
  private final Looper zzagr;
  private final String zzbhM;
  private long zzbhR;
  private final TagManager zzbhY;
  private final zzp.zzd zzbib;
  private final zzcd zzbic;
  private final int zzbid;
  private zzp.zzf zzbie;
  private zzrr zzbif;
  private volatile zzo zzbig;
  private volatile boolean zzbih;
  private zzaf.zzj zzbii;
  private String zzbij;
  private zzp.zze zzbik;
  private zzp.zza zzbil;
  private final zzmq zzqW;
  
  zzp(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzp.zzf paramzzf, zzp.zze paramzze, zzrr paramzzrr, zzmq paramzzmq, zzcd paramzzcd) {}
  
  public zzp(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, zzs paramzzs)
  {
    this(paramContext, paramTagManager, paramLooper, paramString, paramInt, new zzcn(paramContext, paramString), new zzcm(paramContext, paramString, paramzzs), new zzrr(paramContext), zzmt.zzsc(), new zzbe(30, 900000L, 5000L, "refreshing", zzmt.zzsc()));
    zzbif.zzgB(paramzzs.zzGm());
  }
  
  private boolean zzGj()
  {
    zzcb localzzcb = zzcb.zzGU();
    return ((localzzcb.zzGV() == zzcb.zza.zzbjV) || (localzzcb.zzGV() == zzcb.zza.zzbjW)) && (zzbhM.equals(localzzcb.getContainerId()));
  }
  
  private void zza(zzaf.zzj paramzzj)
  {
    try
    {
      if (zzbie != null)
      {
        zzrq.zza localzza = new zzrq.zza();
        zzbmd = zzbhR;
        zzju = new zzaf.zzf();
        zzbme = paramzzj;
        zzbie.zzb(localzza);
      }
      return;
    }
    finally
    {
      paramzzj = finally;
      throw paramzzj;
    }
  }
  
  private void zza(zzaf.zzj paramzzj, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        paramBoolean = zzbih;
        if (paramBoolean) {
          return;
        }
        if (isReady()) {
          zzo localzzo = zzbig;
        }
        zzbii = paramzzj;
        zzbhR = paramLong;
        zzak(Math.max(0L, Math.min(43200000L, zzbhR + 43200000L - zzqW.currentTimeMillis())));
        paramzzj = new Container(mContext, zzbhY.getDataLayer(), zzbhM, paramLong, paramzzj);
        if (zzbig == null)
        {
          zzbig = new zzo(zzbhY, zzagr, paramzzj, zzbib);
          if ((!isReady()) && (zzbil.zzb(paramzzj))) {
            zza(zzbig);
          }
        }
        else
        {
          zzbig.zza(paramzzj);
        }
      }
      finally {}
    }
  }
  
  /* Error */
  private void zzak(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 62	com/google/android/gms/tagmanager/zzp:zzbik	Lcom/google/android/gms/tagmanager/zzp$zze;
    //   6: ifnonnull +12 -> 18
    //   9: ldc_w 260
    //   12: invokestatic 265	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: aload_0
    //   19: getfield 62	com/google/android/gms/tagmanager/zzp:zzbik	Lcom/google/android/gms/tagmanager/zzp$zze;
    //   22: lload_1
    //   23: aload_0
    //   24: getfield 78	com/google/android/gms/tagmanager/zzp:zzbii	Lcom/google/android/gms/internal/zzaf$zzj;
    //   27: getfield 268	com/google/android/gms/internal/zzaf$zzj:zzjv	Ljava/lang/String;
    //   30: invokeinterface 274 4 0
    //   35: goto -20 -> 15
    //   38: astore_3
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	zzp
    //   0	43	1	paramLong	long
    //   38	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	38	finally
    //   18	35	38	finally
  }
  
  private void zzaw(boolean paramBoolean)
  {
    zzbie.zza(new zzp.zzb(this, null));
    zzbik.zza(new zzp.zzc(this, null));
    zzrs.zzc localzzc = zzbie.zzke(zzbid);
    if (localzzc != null) {
      zzbig = new zzo(zzbhY, zzagr, new Container(mContext, zzbhY.getDataLayer(), zzbhM, 0L, localzzc), zzbib);
    }
    zzbil = new zzp.3(this, paramBoolean);
    if (zzGj())
    {
      zzbik.zzf(0L, "");
      return;
    }
    zzbie.zzGl();
  }
  
  String zzGd()
  {
    try
    {
      String str = zzbij;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void zzGg()
  {
    Object localObject = zzbie.zzke(zzbid);
    if (localObject != null)
    {
      localObject = new Container(mContext, zzbhY.getDataLayer(), zzbhM, 0L, (zzrs.zzc)localObject);
      zza(new zzo(zzbhY, zzagr, (Container)localObject, new zzp.2(this)));
    }
    for (;;)
    {
      zzbik = null;
      zzbie = null;
      return;
      zzbg.e("Default was requested, but no default container was found");
      zza(zzbn(new Status(10, "Default was requested, but no default container was found", null)));
    }
  }
  
  public void zzGh()
  {
    zzaw(false);
  }
  
  public void zzGi()
  {
    zzaw(true);
  }
  
  protected ContainerHolder zzbn(Status paramStatus)
  {
    if (zzbig != null) {
      return zzbig;
    }
    if (paramStatus == Status.zzagF) {
      zzbg.e("timer expired: setting result to failure");
    }
    return new zzo(paramStatus);
  }
  
  void zzfT(String paramString)
  {
    try
    {
      zzbij = paramString;
      if (zzbik != null) {
        zzbik.zzfW(paramString);
      }
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
 * Qualified Name:     com.google.android.gms.tagmanager.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */