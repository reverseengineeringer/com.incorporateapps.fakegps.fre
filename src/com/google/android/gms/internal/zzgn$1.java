package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicBoolean;

class zzgn$1
  implements Runnable
{
  zzgn$1(zzgn paramzzgn) {}
  
  public void run()
  {
    if (!zzgn.zza(zzGi).get()) {
      return;
    }
    zzin.e("Timed out waiting for WebView to finish loading.");
    zzGi.cancel();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgn.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */