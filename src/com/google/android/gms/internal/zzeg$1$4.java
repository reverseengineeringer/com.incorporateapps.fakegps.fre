package com.google.android.gms.internal;

class zzeg$1$4
  implements Runnable
{
  zzeg$1$4(zzeg.1 param1, zzed paramzzed) {}
  
  public void run()
  {
    synchronized (zzeg.zzc(zzBg.zzBe))
    {
      if ((zzBg.zzBd.getStatus() == -1) || (zzBg.zzBd.getStatus() == 1)) {
        return;
      }
      zzBg.zzBd.reject();
      zzir.runOnUiThread(new zzeg.1.4.1(this));
      zzin.v("Could not receive loaded message in a timely manner. Rejecting.");
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.1.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */