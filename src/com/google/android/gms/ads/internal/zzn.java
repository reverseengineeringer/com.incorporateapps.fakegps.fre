package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzy.zza;
import com.google.android.gms.internal.zzin;

public class zzn
  extends zzy.zza
{
  private static final Object zzqy = new Object();
  private static zzn zzqz;
  private final Context mContext;
  private final Object zzpV = new Object();
  private boolean zzqA;
  private float zzqB = -1.0F;
  
  zzn(Context paramContext)
  {
    mContext = paramContext;
    zzqA = false;
  }
  
  public static zzn zzbs()
  {
    synchronized (zzqy)
    {
      zzn localzzn = zzqz;
      return localzzn;
    }
  }
  
  public static zzn zzr(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzqz == null) {
        zzqz = new zzn(paramContext.getApplicationContext());
      }
      paramContext = zzqz;
      return paramContext;
    }
  }
  
  public void setAppVolume(float paramFloat)
  {
    synchronized (zzpV)
    {
      zzqB = paramFloat;
      return;
    }
  }
  
  public void zza()
  {
    synchronized (zzqy)
    {
      if (zzqA)
      {
        zzin.zzaK("Mobile ads is initialized already.");
        return;
      }
      zzqA = true;
      return;
    }
  }
  
  public float zzbt()
  {
    synchronized (zzpV)
    {
      float f = zzqB;
      return f;
    }
  }
  
  public boolean zzbu()
  {
    synchronized (zzpV)
    {
      if (zzqB >= 0.0F)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */