package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzir;

class zzu
  implements Runnable
{
  private boolean mCancelled = false;
  private zzk zzFo;
  
  zzu(zzk paramzzk)
  {
    zzFo = paramzzk;
  }
  
  public void cancel()
  {
    mCancelled = true;
    zzir.zzMc.removeCallbacks(this);
  }
  
  public void run()
  {
    if (!mCancelled)
    {
      zzFo.zzfF();
      zzfQ();
    }
  }
  
  public void zzfQ()
  {
    zzir.zzMc.postDelayed(this, 250L);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */