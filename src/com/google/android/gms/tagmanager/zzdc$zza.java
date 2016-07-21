package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.Logger;

class zzdc$zza
  implements Logger
{
  private static int zzkn(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    default: 
      return 3;
    case 5: 
      return 2;
    case 3: 
    case 4: 
      return 1;
    }
    return 0;
  }
  
  public void error(Exception paramException)
  {
    zzbg.zzb("", paramException);
  }
  
  public void error(String paramString)
  {
    zzbg.e(paramString);
  }
  
  public int getLogLevel()
  {
    return zzkn(zzbg.getLogLevel());
  }
  
  public void info(String paramString)
  {
    zzbg.zzaJ(paramString);
  }
  
  public void setLogLevel(int paramInt)
  {
    zzbg.zzaK("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
  }
  
  public void verbose(String paramString)
  {
    zzbg.v(paramString);
  }
  
  public void warn(String paramString)
  {
    zzbg.zzaK(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzdc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */