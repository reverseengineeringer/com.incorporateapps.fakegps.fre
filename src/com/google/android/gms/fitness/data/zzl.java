package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.request.OnDataPointListener;

public class zzl
  extends zzk.zza
{
  private final OnDataPointListener zzaxb;
  
  private zzl(OnDataPointListener paramOnDataPointListener)
  {
    zzaxb = ((OnDataPointListener)zzx.zzz(paramOnDataPointListener));
  }
  
  public void zzc(DataPoint paramDataPoint)
  {
    zzaxb.onDataPoint(paramDataPoint);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */