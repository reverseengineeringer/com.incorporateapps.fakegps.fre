package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class zzg
  extends zzz
{
  private long zzaVK;
  private String zzaVL;
  
  zzg(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  public String zzCA()
  {
    zzjv();
    return zzaVL;
  }
  
  public String zzCy()
  {
    zzjv();
    return Build.VERSION.RELEASE;
  }
  
  public long zzCz()
  {
    zzjv();
    return zzaVK;
  }
  
  public String zzht()
  {
    zzjv();
    return Build.MODEL;
  }
  
  protected void zziJ()
  {
    Object localObject = Calendar.getInstance();
    TimeUnit localTimeUnit = TimeUnit.MINUTES;
    int i = ((Calendar)localObject).get(15);
    zzaVK = localTimeUnit.convert(((Calendar)localObject).get(16) + i, TimeUnit.MILLISECONDS);
    localObject = Locale.getDefault();
    zzaVL = (((Locale)localObject).getLanguage().toLowerCase(Locale.ENGLISH) + "-" + ((Locale)localObject).getCountry().toLowerCase(Locale.ENGLISH));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */