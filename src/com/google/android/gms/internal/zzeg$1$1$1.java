package com.google.android.gms.internal;

class zzeg$1$1$1
  implements Runnable
{
  zzeg$1$1$1(zzeg.1.1 param1) {}
  
  public void run()
  {
    synchronized (zzeg.zzc(zzBh.zzBg.zzBe))
    {
      if ((zzBh.zzBg.zzBd.getStatus() == -1) || (zzBh.zzBg.zzBd.getStatus() == 1)) {
        return;
      }
      zzBh.zzBg.zzBd.reject();
      zzir.runOnUiThread(new zzeg.1.1.1.1(this));
      zzin.v("Could not receive loaded message in a timely manner. Rejecting.");
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.1.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */