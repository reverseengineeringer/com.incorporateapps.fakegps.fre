package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.a.a.d;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzam
  extends zzal
{
  private static AdvertisingIdClient zzok = null;
  private static CountDownLatch zzol = new CountDownLatch(1);
  private boolean zzom;
  
  protected zzam(Context paramContext, zzap paramzzap, boolean paramBoolean)
  {
    super(paramContext, paramzzap);
    zzom = paramBoolean;
  }
  
  public static zzam zza(String paramString, Context paramContext, boolean paramBoolean)
  {
    zzah localzzah = new zzah();
    zza(paramString, paramContext, localzzah);
    if (paramBoolean) {}
    try
    {
      if (zzok == null) {
        new Thread(new zzam.zzb(paramContext)).start();
      }
      return new zzam(paramContext, localzzah, paramBoolean);
    }
    finally {}
  }
  
  private void zza(Context paramContext, d paramd)
  {
    if (!zzom) {}
    for (;;)
    {
      return;
      try
      {
        if (zzS())
        {
          paramContext = zzY();
          String str = paramContext.getId();
          if (str != null)
          {
            O = Boolean.valueOf(paramContext.isLimitAdTrackingEnabled());
            N = Integer.valueOf(5);
            M = str;
            zza(28, zzob);
          }
        }
        else
        {
          M = zzf(paramContext);
          zza(24, zzob);
          return;
        }
      }
      catch (zzal.zza paramContext) {}catch (IOException paramContext) {}
    }
  }
  
  zzam.zza zzY()
  {
    try
    {
      if (!zzol.await(2L, TimeUnit.SECONDS))
      {
        zzam.zza localzza1 = new zzam.zza(this, null, false);
        return localzza1;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      return new zzam.zza(this, null, false);
    }
    try
    {
      if (zzok == null)
      {
        zzam.zza localzza2 = new zzam.zza(this, null, false);
        return localzza2;
      }
    }
    finally {}
    AdvertisingIdClient.Info localInfo = zzok.getInfo();
    return new zzam.zza(this, zzk(localInfo.getId()), localInfo.isLimitAdTrackingEnabled());
  }
  
  protected d zzc(Context paramContext)
  {
    d locald = super.zzc(paramContext);
    zza(paramContext, locald);
    return locald;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */