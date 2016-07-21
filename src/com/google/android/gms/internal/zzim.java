package com.google.android.gms.internal;

import java.util.concurrent.Future;

public abstract class zzim
  implements zzit
{
  private volatile Thread zzLM;
  private boolean zzLN;
  private final Runnable zzx = new zzim.1(this);
  
  public zzim()
  {
    zzLN = false;
  }
  
  public zzim(boolean paramBoolean)
  {
    zzLN = paramBoolean;
  }
  
  public final void cancel()
  {
    onStop();
    if (zzLM != null) {
      zzLM.interrupt();
    }
  }
  
  public abstract void onStop();
  
  public abstract void zzbr();
  
  public final Future zzhn()
  {
    if (zzLN) {
      return zziq.zza(1, zzx);
    }
    return zziq.zza(zzx);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzim
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */