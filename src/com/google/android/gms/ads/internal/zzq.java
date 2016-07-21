package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.lang.ref.WeakReference;

public class zzq
{
  private final zzq.zza zzqG;
  private AdRequestParcel zzqH;
  private boolean zzqI = false;
  private boolean zzqJ = false;
  private long zzqK = 0L;
  private final Runnable zzx;
  
  public zzq(zza paramzza)
  {
    this(paramzza, new zzq.zza(zzir.zzMc));
  }
  
  zzq(zza paramzza, zzq.zza paramzza1)
  {
    zzqG = paramzza1;
    zzx = new zzq.1(this, new WeakReference(paramzza));
  }
  
  public void cancel()
  {
    zzqI = false;
    zzqG.removeCallbacks(zzx);
  }
  
  public void pause()
  {
    zzqJ = true;
    if (zzqI) {
      zzqG.removeCallbacks(zzx);
    }
  }
  
  public void resume()
  {
    zzqJ = false;
    if (zzqI)
    {
      zzqI = false;
      zza(zzqH, zzqK);
    }
  }
  
  public void zza(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    if (zzqI) {
      zzin.zzaK("An ad refresh is already scheduled.");
    }
    do
    {
      return;
      zzqH = paramAdRequestParcel;
      zzqI = true;
      zzqK = paramLong;
    } while (zzqJ);
    zzin.zzaJ("Scheduling ad refresh " + paramLong + " milliseconds from now.");
    zzqG.postDelayed(zzx, paramLong);
  }
  
  public boolean zzbw()
  {
    return zzqI;
  }
  
  public void zzg(AdRequestParcel paramAdRequestParcel)
  {
    zza(paramAdRequestParcel, 60000L);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */