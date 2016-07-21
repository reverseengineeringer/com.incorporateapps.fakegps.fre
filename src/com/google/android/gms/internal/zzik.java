package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzr;

public class zzik
{
  private int zzLJ;
  private int zzLK;
  private final String zzLh;
  private final Object zzpV = new Object();
  private final zzih zzqV;
  
  zzik(zzih paramzzih, String paramString)
  {
    zzqV = paramzzih;
    zzLh = paramString;
  }
  
  public zzik(String paramString)
  {
    this(zzr.zzbF(), paramString);
  }
  
  public Bundle toBundle()
  {
    synchronized (zzpV)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", zzLJ);
      localBundle.putInt("pmnll", zzLK);
      return localBundle;
    }
  }
  
  public void zzg(int paramInt1, int paramInt2)
  {
    synchronized (zzpV)
    {
      zzLJ = paramInt1;
      zzLK = paramInt2;
      zzqV.zza(zzLh, this);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzik
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */