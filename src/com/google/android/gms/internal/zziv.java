package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public class zziv
{
  private final String[] zzMn;
  private final double[] zzMo;
  private final double[] zzMp;
  private final int[] zzMq;
  private int zzMr;
  
  private zziv(zziv.zzb paramzzb)
  {
    int i = zziv.zzb.zza(paramzzb).size();
    zzMn = ((String[])zziv.zzb.zzb(paramzzb).toArray(new String[i]));
    zzMo = zzk(zziv.zzb.zza(paramzzb));
    zzMp = zzk(zziv.zzb.zzc(paramzzb));
    zzMq = new int[i];
    zzMr = 0;
  }
  
  private double[] zzk(List paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    int i = 0;
    while (i < arrayOfDouble.length)
    {
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
      i += 1;
    }
    return arrayOfDouble;
  }
  
  public List getBuckets()
  {
    ArrayList localArrayList = new ArrayList(zzMn.length);
    int i = 0;
    while (i < zzMn.length)
    {
      localArrayList.add(new zziv.zza(zzMn[i], zzMp[i], zzMo[i], zzMq[i] / zzMr, zzMq[i]));
      i += 1;
    }
    return localArrayList;
  }
  
  public void zza(double paramDouble)
  {
    zzMr += 1;
    int i = 0;
    while (i < zzMp.length)
    {
      if ((zzMp[i] <= paramDouble) && (paramDouble < zzMo[i]))
      {
        int[] arrayOfInt = zzMq;
        arrayOfInt[i] += 1;
      }
      if (paramDouble < zzMp[i]) {
        break;
      }
      i += 1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */