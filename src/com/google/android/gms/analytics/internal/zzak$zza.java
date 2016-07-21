package com.google.android.gms.analytics.internal;

import java.util.Map;

class zzak$zza
  extends zzc
  implements zzq.zza
{
  private final zzal zzTn = new zzal();
  
  public zzak$zza(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public void zzc(String paramString, int paramInt)
  {
    if ("ga_sessionTimeout".equals(paramString))
    {
      zzTn.zzTp = paramInt;
      return;
    }
    zzd("int configuration name not recognized", paramString);
  }
  
  public void zzf(String paramString, boolean paramBoolean)
  {
    int j = 1;
    int k = 1;
    int i = 1;
    if ("ga_autoActivityTracking".equals(paramString))
    {
      paramString = zzTn;
      if (paramBoolean) {}
      for (;;)
      {
        zzTq = i;
        return;
        i = 0;
      }
    }
    if ("ga_anonymizeIp".equals(paramString))
    {
      paramString = zzTn;
      if (paramBoolean) {}
      for (i = j;; i = 0)
      {
        zzTr = i;
        return;
      }
    }
    if ("ga_reportUncaughtExceptions".equals(paramString))
    {
      paramString = zzTn;
      if (paramBoolean) {}
      for (i = k;; i = 0)
      {
        zzTs = i;
        return;
      }
    }
    zzd("bool configuration name not recognized", paramString);
  }
  
  public void zzj(String paramString1, String paramString2)
  {
    zzTn.zzTt.put(paramString1, paramString2);
  }
  
  public void zzk(String paramString1, String paramString2)
  {
    if ("ga_trackingId".equals(paramString1))
    {
      zzTn.zzOV = paramString2;
      return;
    }
    if ("ga_sampleFrequency".equals(paramString1)) {
      try
      {
        zzTn.zzTo = Double.parseDouble(paramString2);
        return;
      }
      catch (NumberFormatException paramString1)
      {
        zzc("Error parsing ga_sampleFrequency value", paramString2, paramString1);
        return;
      }
    }
    zzd("string configuration name not recognized", paramString1);
  }
  
  public zzal zzlS()
  {
    return zzTn;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzak.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */