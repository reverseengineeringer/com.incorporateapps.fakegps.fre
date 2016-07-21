package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;

public final class LaunchOptions$Builder
{
  private LaunchOptions zzaaM = new LaunchOptions();
  
  public final LaunchOptions build()
  {
    return zzaaM;
  }
  
  public final Builder setLocale(Locale paramLocale)
  {
    zzaaM.setLanguage(zzf.zzb(paramLocale));
    return this;
  }
  
  public final Builder setRelaunchIfRunning(boolean paramBoolean)
  {
    zzaaM.setRelaunchIfRunning(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */