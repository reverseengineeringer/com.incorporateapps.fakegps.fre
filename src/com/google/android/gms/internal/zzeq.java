package com.google.android.gms.internal;

public final class zzeq
  extends zzez.zza
{
  private zzes.zza zzCb;
  private zzep zzCc;
  private final Object zzpV = new Object();
  
  public final void onAdClicked()
  {
    synchronized (zzpV)
    {
      if (zzCc != null) {
        zzCc.zzaY();
      }
      return;
    }
  }
  
  public final void onAdClosed()
  {
    synchronized (zzpV)
    {
      if (zzCc != null) {
        zzCc.zzaZ();
      }
      return;
    }
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    synchronized (zzpV)
    {
      if (zzCb != null)
      {
        if (paramInt == 3)
        {
          paramInt = 1;
          zzCb.zzr(paramInt);
          zzCb = null;
        }
      }
      else {
        return;
      }
      paramInt = 2;
    }
  }
  
  public final void onAdLeftApplication()
  {
    synchronized (zzpV)
    {
      if (zzCc != null) {
        zzCc.zzba();
      }
      return;
    }
  }
  
  public final void onAdLoaded()
  {
    synchronized (zzpV)
    {
      if (zzCb != null)
      {
        zzCb.zzr(0);
        zzCb = null;
        return;
      }
      if (zzCc != null) {
        zzCc.zzbc();
      }
      return;
    }
  }
  
  public final void onAdOpened()
  {
    synchronized (zzpV)
    {
      if (zzCc != null) {
        zzCc.zzbb();
      }
      return;
    }
  }
  
  public final void zza(zzep paramzzep)
  {
    synchronized (zzpV)
    {
      zzCc = paramzzep;
      return;
    }
  }
  
  public final void zza(zzes.zza paramzza)
  {
    synchronized (zzpV)
    {
      zzCb = paramzza;
      return;
    }
  }
  
  public final void zza(zzfa paramzzfa)
  {
    synchronized (zzpV)
    {
      if (zzCb != null)
      {
        zzCb.zza(0, paramzzfa);
        zzCb = null;
        return;
      }
      if (zzCc != null) {
        zzCc.zzbc();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */