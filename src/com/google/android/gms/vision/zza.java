package com.google.android.gms.vision;

import android.util.SparseArray;

public class zza
{
  private static int zzbnl = 0;
  private static final Object zzqy = new Object();
  private SparseArray zzbnm = new SparseArray();
  private SparseArray zzbnn = new SparseArray();
  
  public int zzkr(int paramInt)
  {
    synchronized (zzqy)
    {
      Integer localInteger = (Integer)zzbnm.get(paramInt);
      if (localInteger != null)
      {
        paramInt = localInteger.intValue();
        return paramInt;
      }
      int i = zzbnl;
      zzbnl += 1;
      zzbnm.append(paramInt, Integer.valueOf(i));
      zzbnn.append(i, Integer.valueOf(paramInt));
      return i;
    }
  }
  
  public int zzks(int paramInt)
  {
    synchronized (zzqy)
    {
      paramInt = ((Integer)zzbnn.get(paramInt)).intValue();
      return paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */