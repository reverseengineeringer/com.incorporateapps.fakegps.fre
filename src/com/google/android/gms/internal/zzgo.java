package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;

public class zzgo
  implements Runnable
{
  private final Handler zzGj;
  private final long zzGk;
  private long zzGl;
  private zzjq.zza zzGm;
  protected boolean zzGn;
  protected boolean zzGo;
  private final int zzoG;
  private final int zzoH;
  protected final zzjp zzpD;
  
  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2)
  {
    this(paramzza, paramzzjp, paramInt1, paramInt2, 200L, 50L);
  }
  
  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    zzGk = paramLong1;
    zzGl = paramLong2;
    zzGj = new Handler(Looper.getMainLooper());
    zzpD = paramzzjp;
    zzGm = paramzza;
    zzGn = false;
    zzGo = false;
    zzoH = paramInt2;
    zzoG = paramInt1;
  }
  
  public void run()
  {
    if ((zzpD == null) || (zzgg()))
    {
      zzGm.zza(zzpD, true);
      return;
    }
    new zzgo.zza(this, zzpD.getWebView()).execute(new Void[0]);
  }
  
  public void zza(AdResponseParcel paramAdResponseParcel)
  {
    zza(paramAdResponseParcel, new zzjy(this, zzpD, zzIa));
  }
  
  public void zza(AdResponseParcel paramAdResponseParcel, zzjy paramzzjy)
  {
    zzpD.setWebViewClient(paramzzjy);
    zzjp localzzjp = zzpD;
    if (TextUtils.isEmpty(zzEF)) {}
    for (paramzzjy = null;; paramzzjy = zzr.zzbC().zzaC(zzEF))
    {
      localzzjp.loadDataWithBaseURL(paramzzjy, body, "text/html", "UTF-8", null);
      return;
    }
  }
  
  public void zzge()
  {
    zzGj.postDelayed(this, zzGk);
  }
  
  public void zzgf()
  {
    try
    {
      zzGn = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean zzgg()
  {
    try
    {
      boolean bool = zzGn;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean zzgh()
  {
    return zzGo;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */