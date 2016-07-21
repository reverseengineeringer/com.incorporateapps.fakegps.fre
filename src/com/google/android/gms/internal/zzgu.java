package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzgu
  extends zzgq
{
  private zzeo zzCf;
  private boolean zzGA;
  private zzem zzGy;
  protected zzes zzGz;
  private final zzjp zzpD;
  private final zzcb zzpe;
  private zzex zzpn;
  
  zzgu(Context paramContext, zzif.zza paramzza, zzex paramzzex, zzgr.zza paramzza1, zzcb paramzzcb, zzjp paramzzjp)
  {
    super(paramContext, paramzza, paramzza1);
    zzpn = paramzzex;
    zzCf = zzKV;
    zzpe = paramzzcb;
    zzpD = paramzzjp;
  }
  
  private void zzgk()
  {
    ??? = new CountDownLatch(1);
    zzir.zzMc.post(new zzgu.1(this, (CountDownLatch)???));
    try
    {
      ((CountDownLatch)???).await(10L, TimeUnit.SECONDS);
      synchronized (zzGg)
      {
        if (!zzGA) {
          throw new zzgq.zza("View could not be prepared", 0);
        }
      }
      if (!zzpD.isDestroyed()) {
        break label115;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new zzgq.zza("Interrupted while waiting for latch : " + localInterruptedException, 0);
    }
    throw new zzgq.zza("Assets not loaded, web view is destroyed", 0);
    label115:
  }
  
  public void onStop()
  {
    synchronized (zzGg)
    {
      super.onStop();
      if (zzGy != null) {
        zzGy.cancel();
      }
      return;
    }
  }
  
  protected zzif zzD(int paramInt)
  {
    Object localObject = zzGd.zzLd;
    AdRequestParcel localAdRequestParcel = zzHt;
    zzjp localzzjp = zzpD;
    List localList1 = zzGe.zzBQ;
    List localList2 = zzGe.zzBR;
    List localList3 = zzGe.zzHV;
    int i = zzGe.orientation;
    long l = zzGe.zzBU;
    String str2 = zzHw;
    boolean bool = zzGe.zzHT;
    zzey localzzey;
    label113:
    String str1;
    label129:
    zzeo localzzeo;
    if (zzGz != null)
    {
      localObject = zzGz.zzCp;
      if (zzGz == null) {
        break label270;
      }
      localzzey = zzGz.zzCq;
      if (zzGz == null) {
        break label276;
      }
      str1 = zzGz.zzCr;
      localzzeo = zzCf;
      if (zzGz == null) {
        break label286;
      }
    }
    label270:
    label276:
    label286:
    for (zzeq localzzeq = zzGz.zzCs;; localzzeq = null)
    {
      return new zzif(localAdRequestParcel, localzzjp, localList1, paramInt, localList2, localList3, i, l, str2, bool, (zzen)localObject, localzzey, str1, localzzeo, localzzeq, zzGe.zzHU, zzGd.zzrp, zzGe.zzHS, zzGd.zzKY, zzGe.zzHX, zzGe.zzHY, zzGd.zzKT, null, zzGe.zzIj, zzGe.zzIk, zzGe.zzIl, zzGe.zzIm);
      localObject = null;
      break;
      localzzey = null;
      break label113;
      str1 = AdMobAdapter.class.getName();
      break label129;
    }
  }
  
  protected void zzh(long paramLong)
  {
    synchronized (zzGg)
    {
      zzGy = zzi(paramLong);
      zzGz = zzGy.zzc(zzCf.zzBO);
      switch (zzGz.zzCo)
      {
      default: 
        throw new zzgq.zza("Unexpected mediation result: " + zzGz.zzCo, 0);
      }
    }
    throw new zzgq.zza("No fill from any mediation ad networks.", 3);
    if ((zzGz.zzCp != null) && (zzGz.zzCp.zzBJ != null)) {
      zzgk();
    }
  }
  
  zzem zzi(long paramLong)
  {
    if (zzCf.zzBX != -1) {
      return new zzeu(mContext, zzGd.zzLd, zzpn, zzCf, zzGe.zzuk, zzGe.zzum, paramLong, ((Long)zzbt.zzwY.get()).longValue(), 2);
    }
    return new zzev(mContext, zzGd.zzLd, zzpn, zzCf, zzGe.zzuk, zzGe.zzum, paramLong, ((Long)zzbt.zzwY.get()).longValue(), zzpe);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */