package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class zzgn
  implements zzit, zzjq.zza
{
  protected final Context mContext;
  protected final zzgr.zza zzGc;
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;
  private Runnable zzGf;
  protected final Object zzGg = new Object();
  private AtomicBoolean zzGh = new AtomicBoolean(true);
  protected final zzjp zzpD;
  
  protected zzgn(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    mContext = paramContext;
    zzGd = paramzza;
    zzGe = zzGd.zzLe;
    zzpD = paramzzjp;
    zzGc = paramzza1;
  }
  
  private zzif zzD(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = zzGd.zzLd;
    return new zzif(zzHt, zzpD, zzGe.zzBQ, paramInt, zzGe.zzBR, zzGe.zzHV, zzGe.orientation, zzGe.zzBU, zzHw, zzGe.zzHT, null, null, null, null, null, zzGe.zzHU, zzGd.zzrp, zzGe.zzHS, zzGd.zzKY, zzGe.zzHX, zzGe.zzHY, zzGd.zzKT, null, zzGe.zzIj, zzGe.zzIk, zzGe.zzIl, zzGe.zzIm);
  }
  
  public void cancel()
  {
    if (!zzGh.getAndSet(false)) {
      return;
    }
    zzpD.stopLoading();
    zzr.zzbE().zzi(zzpD);
    zzC(-1);
    zzir.zzMc.removeCallbacks(zzGf);
  }
  
  protected void zzC(int paramInt)
  {
    if (paramInt != -2) {
      zzGe = new AdResponseParcel(paramInt, zzGe.zzBU);
    }
    zzpD.zzhO();
    zzGc.zzb(zzD(paramInt));
  }
  
  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    zzin.zzaI("WebView finished loading.");
    if (!zzGh.getAndSet(false)) {
      return;
    }
    if (paramBoolean) {}
    for (int i = zzgc();; i = -1)
    {
      zzC(i);
      zzir.zzMc.removeCallbacks(zzGf);
      return;
    }
  }
  
  public final Void zzga()
  {
    zzx.zzcD("Webview render task needs to be called on UI thread.");
    zzGf = new zzgn.1(this);
    zzir.zzMc.postDelayed(zzGf, ((Long)zzbt.zzwY.get()).longValue());
    zzgb();
    return null;
  }
  
  protected abstract void zzgb();
  
  protected int zzgc()
  {
    return -2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */