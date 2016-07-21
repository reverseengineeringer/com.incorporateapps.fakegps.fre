package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzpq;
import com.google.android.gms.measurement.zzg;

public class zzk
  extends zzd
{
  private final zzpq zzQX = new zzpq();
  
  zzk(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public void zziE()
  {
    Object localObject = zziI();
    String str = ((zzan)localObject).zzlg();
    if (str != null) {
      zzQX.setAppName(str);
    }
    localObject = ((zzan)localObject).zzli();
    if (localObject != null) {
      zzQX.setAppVersion((String)localObject);
    }
  }
  
  protected void zziJ()
  {
    zzjo().zzAH().zza(zzQX);
    zziE();
  }
  
  public zzpq zzjS()
  {
    zzjv();
    return zzQX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */