package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;

public class zzeg$zze
  extends zzjj
{
  private zzeg.zzb zzBa;
  private boolean zzBr;
  private int zzBs;
  private final Object zzpV = new Object();
  
  public zzeg$zze(zzeg.zzb paramzzb)
  {
    zzBa = paramzzb;
    zzBr = false;
    zzBs = 0;
  }
  
  public zzeg.zzd zzes()
  {
    zzeg.zzd localzzd = new zzeg.zzd(this);
    synchronized (zzpV)
    {
      zza(new zzeg.zze.1(this, localzzd), new zzeg.zze.2(this, localzzd));
      if (zzBs >= 0)
      {
        bool = true;
        zzx.zzab(bool);
        zzBs += 1;
        return localzzd;
      }
      boolean bool = false;
    }
  }
  
  protected void zzet()
  {
    synchronized (zzpV)
    {
      if (zzBs > 0)
      {
        bool = true;
        zzx.zzab(bool);
        zzin.v("Releasing 1 reference for JS Engine");
        zzBs -= 1;
        zzev();
        return;
      }
      boolean bool = false;
    }
  }
  
  public void zzeu()
  {
    boolean bool = true;
    synchronized (zzpV)
    {
      if (zzBs >= 0)
      {
        zzx.zzab(bool);
        zzin.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
        zzBr = true;
        zzev();
        return;
      }
      bool = false;
    }
  }
  
  protected void zzev()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzBs >= 0)
        {
          bool = true;
          zzx.zzab(bool);
          if ((zzBr) && (zzBs == 0))
          {
            zzin.v("No reference is left (including root). Cleaning up engine.");
            zza(new zzeg.zze.3(this), new zzji.zzb());
            return;
          }
          zzin.v("There are still references to the engine. Not destroying.");
        }
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */