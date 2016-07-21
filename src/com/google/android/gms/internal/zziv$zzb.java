package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class zziv$zzb
{
  private final List zzMv = new ArrayList();
  private final List zzMw = new ArrayList();
  private final List zzMx = new ArrayList();
  
  public zzb zza(String paramString, double paramDouble1, double paramDouble2)
  {
    int i = 0;
    while (i < zzMv.size())
    {
      double d1 = ((Double)zzMx.get(i)).doubleValue();
      double d2 = ((Double)zzMw.get(i)).doubleValue();
      if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2))) {
        break;
      }
      i += 1;
    }
    zzMv.add(i, paramString);
    zzMx.add(i, Double.valueOf(paramDouble1));
    zzMw.add(i, Double.valueOf(paramDouble2));
    return this;
  }
  
  public zziv zzhA()
  {
    return new zziv(this, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziv.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */