package com.google.android.gms.fitness.service;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzk;
import java.util.Iterator;
import java.util.List;

class zzb
  implements SensorEventDispatcher
{
  private final zzk zzaBh;
  
  zzb(zzk paramzzk)
  {
    zzaBh = ((zzk)zzx.zzz(paramzzk));
  }
  
  public void publish(DataPoint paramDataPoint)
  {
    paramDataPoint.zzui();
    zzaBh.zzc(paramDataPoint);
  }
  
  public void publish(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      publish((DataPoint)paramList.next());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.service.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */