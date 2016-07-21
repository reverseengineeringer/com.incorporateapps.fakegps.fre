package com.google.android.gms.analytics.internal;

class zzz$zza
  implements zzq.zza
{
  private final zzf zzQj;
  private final zzaa zzSD;
  
  public zzz$zza(zzf paramzzf)
  {
    zzQj = paramzzf;
    zzSD = new zzaa();
  }
  
  public void zzc(String paramString, int paramInt)
  {
    if ("ga_dispatchPeriod".equals(paramString))
    {
      zzSD.zzSH = paramInt;
      return;
    }
    zzQj.zzjm().zzd("Int xml configuration name not recognized", paramString);
  }
  
  public void zzf(String paramString, boolean paramBoolean)
  {
    if ("ga_dryRun".equals(paramString))
    {
      paramString = zzSD;
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        zzSI = i;
        return;
      }
    }
    zzQj.zzjm().zzd("Bool xml configuration name not recognized", paramString);
  }
  
  public void zzj(String paramString1, String paramString2) {}
  
  public void zzk(String paramString1, String paramString2)
  {
    if ("ga_appName".equals(paramString1))
    {
      zzSD.zzSE = paramString2;
      return;
    }
    if ("ga_appVersion".equals(paramString1))
    {
      zzSD.zzSF = paramString2;
      return;
    }
    if ("ga_logLevel".equals(paramString1))
    {
      zzSD.zzSG = paramString2;
      return;
    }
    zzQj.zzjm().zzd("String xml configuration name not recognized", paramString1);
  }
  
  public zzaa zzle()
  {
    return zzSD;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzz.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */